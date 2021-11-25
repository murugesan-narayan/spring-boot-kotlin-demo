package com.muru.kotlin.demo.objects

class MyClass {
    // An object declaration inside a class can be marked with the companion keyword
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

class MyClassC {
    // companion obj name can be omitted
    companion object { }
}

fun main() {
    // Members of the companion object can be called simply by using the class name as the qualifier
    val instance = MyClass.create()

    val x = MyClassC.Companion // default Companion ref available if name omitted.
}