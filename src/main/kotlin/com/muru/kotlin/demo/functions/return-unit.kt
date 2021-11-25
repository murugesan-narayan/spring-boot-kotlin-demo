package com.muru.kotlin.demo.functions

fun printHello(name: String?): Unit {   // The Unit return type declaration is also optional
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    // `return Unit` or `return` is optional
}
