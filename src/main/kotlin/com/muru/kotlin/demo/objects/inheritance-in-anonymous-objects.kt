package com.muru.kotlin.demo.objects

open class A(x: Int) {
    open val y: Int = x
    fun methodA() = "A"
}

interface B {
    fun getName() = "Interface B"
}

fun main() {
    val ab = object : A(1), B {
        override val y = 15
        override fun getName() = "Object AB"
    }
    println(ab.y)
    println(ab.getName())
    println(ab.methodA())
}