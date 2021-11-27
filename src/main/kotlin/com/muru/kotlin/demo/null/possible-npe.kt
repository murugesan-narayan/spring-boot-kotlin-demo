package com.muru.kotlin.demo.`null`

//The only possible causes of an NPE in Kotlin are:
// 1. An explicit call to throw NullPointerException().
// 2. Usage of the !! operator that is described below.

fun main() {
    var a: String = "abc" // Regular initialization means non-null by default
    //a = null // compilation error
    val l = a.length    // null-safe

    var b: String? = "abc" // can be set to null
    b = null // ok
    print(b)
    //val l2 = b.length // error: variable 'b' can be null

}
