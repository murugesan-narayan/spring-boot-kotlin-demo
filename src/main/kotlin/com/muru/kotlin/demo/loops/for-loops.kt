package com.muru.kotlin.demo.loops

fun main() {
    var list = listOf(1, 2,3,5,6,7)
    for (n in list) {
        println(n)
    }
    println("---------")
    for (n in 1 until 11 step 2) {
        println(n)
    }
    println("---------")
    for (n in 9 downTo  1 step 2) {
        println(n)
    }
}