package com.muru.kotlin.demo.loops

fun main() {
    var x = 1
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> print("otherwise")
    }
    var s= "1"
    when (x) {
        s.toInt() -> println("s encodes x")
        else -> print("s does not encode x")
    }
}