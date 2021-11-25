package com.muru.kotlin.demo.functions

// When a function is marked with the tailrec modifier and meets the required formal conditions,
// the compiler optimizes out the recursion,
// leaving behind a fast and efficient loop based version instead

// To be eligible for the tailrec modifier,
// a function must call itself as the last operation it performs.
tailrec fun factorial(n: Long, accum: Long = 1): Long
    = if (n <= 1) n * accum else factorial(n - 1, n * accum)

fun main() {
    println(factorial(5))
}

