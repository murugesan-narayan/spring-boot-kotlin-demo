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
    println("---------")
    for (item in 1..2) println(item)

    println("---------")
    var array = arrayOf(5,6,7)
    for (i in array.indices) {
        println(array[i])
    }

    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            println("Inside inner loop: j=$j ; i=$i")
            if (j == 2 ) break@loop
        }
    }

}