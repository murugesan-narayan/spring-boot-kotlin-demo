package com.muru.kotlin.demo.delegation

import kotlin.reflect.KProperty

class Example {
    // property p is initialized with delegation object Delegate.
    // Delegate will have getter setter for this property
    var p: String by Delegate()

    override fun toString() = "Example Class"
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {        // 2
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) { // 2
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun main() {
    val e = Example()
    println(e.p)        // Delegate getValue method is called
    e.p = "NEW"         // Delegate setValue method is called

    // Standard Delegates
    println("---------------")
    val sample = LazySample()         // lazyStr not yet initialized
    println("lazyStr = ${sample.lazyStr}")  // lazyStr referred for first time, so initialized now
    println(" = ${sample.lazyStr}")  // Now it is already initialized, no re-init, just return it.

    // Storing Properties in a Map
    println("----------------")
    val user = User(mapOf(
        "name" to "John Doe",
        "age"  to 25
    ))          // User properties initialized with corresponding map keys

    println("name = ${user.name}, age = ${user.age}")   //got the value from map

    println("----------------")
    val userV = UserV(mutableMapOf("name" to "Philips", "age" to 35)) //init with delegator
    println(userV)
    userV.name = "Frank"        //we can mutable values outside delegator
    userV.age = 26
    println(userV.getMap())     //but reflected inside the delegator as well.

}
class UserV(private val map: MutableMap<String, Any?>) {    //mutable map so both get and set supported
    var name: String by map                // refers Map key named "name"
    var age: Int     by map                // refers Map key named "age"
    fun getMap() = map
    override fun toString(): String {
        return "UserV[name=$name, age=$age]"
    }
}
class User(val map: Map<String, Any?>) {   // immutable map, so only getters supported
    val name: String by map                // refers Map key named "name"
    val age: Int     by map                // refers Map key named "age"
}

class LazySample {
    init {
        println("created!")            // 1
    }

    val lazyStr: String by lazy {       // get, set delegated to inbuilt lazy delegator
        println("computed!")            // this is not initialized after object creation
                                        // but when we access first time
        "my lazy"
    }
}
