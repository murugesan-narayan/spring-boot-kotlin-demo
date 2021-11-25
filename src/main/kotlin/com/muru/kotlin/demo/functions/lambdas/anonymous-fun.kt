package com.muru.kotlin.demo.functions.lambdas

// An anonymous function looks very much like a regular function declaration,
// except its name is omitted. Its body can be either an expression or a block
fun main() {

    // anonymous function can specify return type
    var f = fun(x: Int, y: Int): Int = x + y

    var c = fun(x: Int, y: Int): Int {
        return x + y
    }

    var l = listOf(1, 2).filter(fun(item) = item > 0)
}
