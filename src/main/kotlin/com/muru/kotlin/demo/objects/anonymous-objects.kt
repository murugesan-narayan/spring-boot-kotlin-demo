package com.muru.kotlin.demo.objects

fun main() {
    val helloWorld = object {
        val hello = "Hello"
        val world = "World"
        // object expressions extend Any, so `override` is required on `toString()`
        override fun toString() = "$hello $world"
    }
    println(helloWorld)
    println(helloWorld.hello)
    println(helloWorld.world)
}