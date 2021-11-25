package com.muru.kotlin.demo.functions.lambdas

fun main() {
    var sum = 0
    listOf(1,2).filter { it > 0 }.forEach {
        sum += it
    }
    print(sum)
}

