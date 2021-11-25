package com.muru.kotlin.demo.basics.types

import kotlin.reflect.KProperty

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("calling getValue....")
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

// the property will be delegated to its getValue() and setValue() methods.
// Property delegates don’t have to implement an interface,
// but they have to provide a getValue() function (and setValue() for var s).
class Example {
    var p: String by Delegate()

    //lazy delegator supports only val
    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }
}

fun main() {
    val e = Example()
    println(e.p)    // getValue called
    e.p = "NEW"     // setValue called

    println(e.lazyValue)    // first time evaluated
    println(e.lazyValue)    // second time NOT evaluated

}
