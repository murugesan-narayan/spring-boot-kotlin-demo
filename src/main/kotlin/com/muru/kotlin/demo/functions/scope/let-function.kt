package com.muru.kotlin.demo.functions.scope

/**
 * let executes the given block of code and returns the result of its last expression.
 * The object is accessible inside the block by the reference it (by default)
 * or a custom name.
 *
 * Uses:
 *  1. when you wish to perform a null safe operation on an Object by using the safe call operator ?.
 *     When doing this the let code block will only be executed if the object is not null.
 *  2. if you need to introduce new variables for the operation, but you want to
 *     confine them to the scope of the let block.
 *  3. Memory allocations (both for function objects and classes) and
 *     virtual calls introduce runtime overhead, but it is not in this case,
 *     no need for function definition or calls, just a block scope
 */
fun main() {
    val empty = "test".let {               // 1
        customPrint(it)                    // 2
        it.isEmpty()                       // 3
    }
    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {                         // null safe call.
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        //custom name instead of it, so that the nested
        // let can access the context object of the outer let.
        strOne?.let { firstString ->
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First","Second")
}

fun customPrint(s: String) {
    print(s.uppercase())
}
