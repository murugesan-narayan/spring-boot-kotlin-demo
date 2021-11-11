package com.muru.kotlin.demo.loops

fun main() {
    for(i in 0..3) {             // starting from 0 up to 3 (inclusive)
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // starting from 0 up to 3 (exclusive)
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // step increment value by 2 for each iteration
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // starting from 3 up to 0 (inclusive) - reverse order
        print(i)
    }
    println()


    for (c in 'a'..'d') {        // Char range
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // 2
        print(c)
    }
    println(" ")


    val x = 2
    if (x in 1..5) {            // checks if value is with-in range
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {          // checks if value is NOT with-in range
        print("x is not in range from 6 to 10")
    }
}