package com.muru.kotlin.demo.collections

fun main() {
    val numbers1 = listOf(1, -2, 3, -4, 5, -6)                // 1

    // Split numbers into a Pair of lists with even and odd numbers
    val evenOdd = numbers1.partition { it % 2 == 0 }
    println(evenOdd)

    val (positives, negatives) = numbers1.partition { it > 0 } // Pair de-structured into two val
    println("$positives $negatives")

    println("----------------------")

    val fruitsBag = listOf("apple","orange","banana","grapes")  // 1
    val clothesBag = listOf("shirts","pants","jeans")           // 2
    val cart = listOf(fruitsBag, clothesBag)                    // contains two list elements
    println(cart)
    // val mapBag = cart.map { it }                                // 4
    //println(mapBag)

    // Returns a single list of all elements yielded from results of transform function being invoked
    // on each element of original collection.
    val flatMapBag = cart.flatMap { it }    //returns one flat list of elements
    println(flatMapBag)

    println("-----------------------")

    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()
    val only = listOf(3)

    println("Numbers: $numbers, min = ${numbers.minOrNull()} max = ${numbers.maxOrNull()}") // 1
    println("Empty: $empty, min = ${empty.minOrNull()}, max = ${empty.maxOrNull()}")        // 2
    println("Only: $only, min = ${only.minOrNull()}, max = ${only.maxOrNull()}")            // 3

}

