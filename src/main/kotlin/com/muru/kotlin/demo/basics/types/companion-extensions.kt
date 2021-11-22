package com.muru.kotlin.demo.basics.types

class MyClass {
    // We can define extension functions and properties for the companion object
    companion object MyCompanion  { }  // will be called "Companion" if no name provided
}

fun MyClass.MyCompanion.printCompanion() { println("companion") }

fun main() {
    MyClass.printCompanion()
}
