package com.muru.kotlin.demo.functions

fun foo(vararg strings: String) { println(strings.joinToString()) }

fun main() {
    foo("1", "2", "3")
    foo(*arrayOf("a", "b", "c"), "d")    // you can use spread operator and add others
}
