package com.muru.kotlin.demo.functions.scope

/**
 * run {} - executes a code block and returns its result
 * It is similar to let, but it does not pass the object as argument
 * rather by default all the methods,fields inside run referred with
 * this of the called object.
 */
fun main() {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {                                                  // 1
            println("\tis empty? " + isEmpty())        // calls ns.isEmpty
            println("\tlength = $length")              // refers ns.length
            length                                                 // 3
        }
    }
    getNullableLength(null)
    println("------")
    getNullableLength("")
    println("------")
    getNullableLength("some string with Kotlin")
    println("------")
}
