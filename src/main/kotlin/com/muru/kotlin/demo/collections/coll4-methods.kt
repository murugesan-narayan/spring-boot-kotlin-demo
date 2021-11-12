package com.muru.kotlin.demo.collections

import kotlin.math.abs

fun main() {
    val shuffled = listOf(5, 4, 2, 1, 3, -10)                   // 1
    println("$shuffled")
    val natural = shuffled.sorted()                             // 2
    val inverted = shuffled.sortedBy { -it }                    // 3
    println("$natural $inverted")
    val descending = shuffled.sortedDescending()                // 4
    val descendingBy = shuffled.sortedByDescending { abs(it)  } // 5
    println("$descending $descendingBy")

    println("----------------------------")
    val map = mapOf("key" to 42)

    val value1 = map["key"]                                     // 1
    val value2 = map["key2"]                                    // 2

    val value3: Int = map.getValue("key")                       // 1

    println("$map $value1 $value2 $value3")

    //returns read only map with default value in place in case key not found for any get
    val mapWithDefault = map.withDefault { k -> k.length }

    //key not found, so returns with default value
    val value4 = mapWithDefault.getValue("key2")                // 3
    println("$value4")

    //Here no default for the keys which does not find.
    // throws NoSuchElementException.
    try {
        map.getValue("anotherKey")                              // 4
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }
}