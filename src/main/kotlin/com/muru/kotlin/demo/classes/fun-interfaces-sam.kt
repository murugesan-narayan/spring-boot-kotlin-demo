package com.muru.kotlin.demo.classes

fun main() {
    //If you don't use a SAM conversion, you will need to write code like this:
    // Creating an instance of a class
    val isEvenO = object : IntPredicate {
        override fun accept(i: Int): Boolean {
            return i % 2 == 0
        }
    }

    //By leveraging Kotlin's SAM conversion, you can write the following equivalent code instead:
    // Creating an instance using lambda
    val isEven = IntPredicate { it % 2 == 0 }
}

// To declare a functional interface in Kotlin, use the fun modifier.
fun interface KRunnable {
    fun invoke()
}

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

