package com.muru.kotlin.demo.reflection

class MyClass

fun main() {
    val kc = MyClass::class
    println(kc)
    println(kc.java)
    println("-----------")
    val widget: Any = MyClass()
    println(widget)
    println(widget::class.qualifiedName)
    println(kc.isInstance(widget))
    println("--------------")
}