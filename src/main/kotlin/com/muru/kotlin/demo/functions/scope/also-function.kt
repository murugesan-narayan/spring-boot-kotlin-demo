package com.muru.kotlin.demo.functions.scope

/**
 * also: it executes a given block and returns the object called
 * Inside the block, the object is referenced by it, so it's easier to pass it as an argument
 * This function is handy for embedding additional actions, such as logging in call chains.
 */
fun main() {
    val jake = PersonInfo("Jake", 30, "Android developer")   // 1
        .also {                                          // 2
            writeCreationLog(it)                         // 3
        }
}

data class PersonInfo(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: PersonInfo) {
    println("A new person ${p.name} was created.")
}
