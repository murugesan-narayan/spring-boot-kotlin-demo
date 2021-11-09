package com.muru.kotlin.demo.collections

fun main() {
    var names = setOf("a", "e", "a", "e")
    println(names)

    var chars = mutableSetOf("a", "e")
    chars.add("b")
    chars.remove("e")
    println(chars)

    var objects = setOf(UserData("n1"), UserData("n2"), UserData("n1"))
    println(objects)

    var l1 = listOf(UserData("n1"), UserData("n2"), UserData("n1"))
    var l2 = listOf(UserData("n1"), UserData("n3"), UserData("n5"))
    var s1 = l1.union(l2)   //returns set.
    println(s1)
}

data class UserData(val name: String)