package com.muru.kotlin.demo.functions.lambdas

// Lambda expressions and anonymous functions are function literals.
// Function literals are functions that are not declared but are passed immediately as an expression
fun main() {
    // A lambda expression is always surrounded by curly braces
    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    val sum1 = { x: Int, y: Int -> x + y }  // return type can be inferred

    // if the last parameter of a function is a function,
    // then a lambda expression passed as the corresponding argument
    // can be placed outside the parentheses
    val product = listOf(1,2).fold(1) { acc, e -> acc * e }

    // this literal is of type '(it: Int) -> Boolean'
    val p = listOf(1,2).filter { it > 0 }

    // You can explicitly return a value from the lambda or omit return statement
    // the value of the last expression is implicitly returned.
    val pi = listOf(1,2).filter {
        val shouldFilter = it > 0
        shouldFilter
    }

    // If the lambda parameter is unused, you can place an underscore instead of its name:
    mapOf(1 to "One").forEach { (_, value) -> println("$value!") }


}
