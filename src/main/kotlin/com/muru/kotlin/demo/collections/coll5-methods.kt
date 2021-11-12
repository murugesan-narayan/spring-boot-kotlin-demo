package com.muru.kotlin.demo.collections

fun main() {
    val A = listOf("a", "b", "c")                  // 1
    val B = listOf(1, 2, 3, 4)                     // 1
    println("$A $B")

    // zip function merges two given collections into a new collection.
    // By default, the result collection contains Pairs of source collection elements
    // with the same index
    // The size of the result collection equals to the minimum size of a source collection.
    val resultPairs = A zip B                      // 2
    println(resultPairs)

    //with overridden zip function.
    val resultReduce = A.zip(B) { a, b -> "$a$b" } // 3
    println(resultReduce)


    println("----------------------")

    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 42 })    // prints 10
    println(list.getOrElse(10) { 42 })  // prints 42 because the index 10 is out of bounds.

    println("------------------------")

    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x") { 1 })       // key not found, so default

    map["x"] = 3
    println(map.getOrElse("x") { 1 })       // key found and val not null, so returns its value

    map["x"] = null
    println(map)
    println(map.getOrElse("x") { 1 })       // key found but value is null, so returns default

    println("------------------------")

}
