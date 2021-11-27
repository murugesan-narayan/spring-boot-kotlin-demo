package com.muru.kotlin.demo.reflection

val x = 1
var y = 1

val String.lastChar: Char
    get() = this[length - 1]

fun main() {
    println(::x.get())
    println(::x.name)

    println("------------")

    ::y.set(2)
    println(y)

    val strs = listOf("a", "bc", "def")
    println(strs.map(String::length))   //String.length property ref

    println(String::lastChar.get("abc"))    // refers String.lastChar extension property

    val prop = "abc"::length
    println(prop.get()) // Property reference can be bound as well
}
