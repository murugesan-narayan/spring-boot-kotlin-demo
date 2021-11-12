package com.muru.kotlin.demo.functions

// A higher-order function is a function
// that takes another function as parameter
// and/or returns a function.

// Taking Functions as Parameters
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3
fun minus(x: Int, y: Int) = x + y                                     // 3


fun square(x: Int) = x * x

// Returning Functions
fun squareOperation(): (Int) -> Int {
                // (Int) -> Int  ---- represents return type function args and return type
    return ::square     // returns the function with the args passed
}

fun main() {
    val sumResult = calculate(4, 5, ::sum)      //locally declared function
    val minusResult = calculate(4, 5, ::minus)  // 4
    val mulResult = calculate(4, 5) { a, b -> a * b }    // passed as inline function
    val divResult = calculate(4, 5) { a, b -> a / b }    // 5
    println("sumResult $sumResult, minusResult $minusResult")
    println("mulResult $mulResult, divResult $divResult")

    val func = squareOperation()    // returns function
    println(func(2))                // passing args to that function
}