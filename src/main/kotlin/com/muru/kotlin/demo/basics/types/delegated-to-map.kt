package com.muru.kotlin.demo.basics.types

class UserD(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}

fun main() {
    val user = UserD(mapOf(
        "name" to "John Doe",
        "age"  to 25
    ))
    println(user.name) // Prints "John Doe"
    println(user.age)  // Prints 25

    println("-----------")
    val m = MutableUser(mutableMapOf(
        "name" to "Joel Sebastian",
        "age"  to 32
    ))
    println(m.name)
    println(m.age)
    m.age = 51      // changes the map as well.
    println(m.map)
}

class MutableUser(val map: MutableMap<String, Any?>) {
    var name: String by map
    var age: Int     by map
}
