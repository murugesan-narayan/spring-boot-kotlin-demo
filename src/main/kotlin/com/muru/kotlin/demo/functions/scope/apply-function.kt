package com.muru.kotlin.demo.functions.scope

/**
 * "apply" executes a block of code on an object and returns the object itself.
 * Inside the block, the object is referenced by this.
 * This function is handy for initializing objects.
 */
fun main() {
    val jake = Person()                                     // 1
    val stringDescription = jake.apply {                    // 2
        name = "Jake"                                       // refers this.name
        age = 30
        about = "Android developer"   // doesn't return last line but return "this" of the caller.
    }.toString()                                            // 4
    println(stringDescription)
}

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}