package com.muru.kotlin.demo.functions

fun foo(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit,
) { /*...*/ }
// If the last argument after default parameters is a lambda,
// you can pass it either as a named argument or outside the parentheses
fun main() {
    foo(1) { println("hello") }     // Uses the default value baz = 1
    foo(qux = { println("hello") })     // Uses both default values bar = 0 and baz = 1
    foo { println("hello") }            // Uses both default values bar = 0 and baz = 1
}
