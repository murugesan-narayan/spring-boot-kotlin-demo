package com.muru.kotlin.demo.basics.types

// To use an extension outside its declaring package, import it at the call site:
fun main() {
    var lastInd = listOf(1,2).lastIndex
    println(lastInd)
}

val <T> List<T>.lastIndex: Int
    get() = size - 1

//val House.number = 1 // error: initializers are not allowed for extension properties

class House