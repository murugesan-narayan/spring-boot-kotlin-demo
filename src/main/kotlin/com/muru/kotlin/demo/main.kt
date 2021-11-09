package com.muru.kotlin.demo

fun main(args: Array<String>) {
    println("Please enter your maths statement")
    var input = readLine()
    while (input != null && input.isNotBlank()) {
        println("You have entered: $input")
        input = readLine()
    }
    println("Bye")
}