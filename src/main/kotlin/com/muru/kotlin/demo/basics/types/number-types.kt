package com.muru.kotlin.demo.basics.types

fun main() {
    val c: Int = 1 // A boxed Int (java.lang.Integer)
    //val d: Long? = c // ERROR can not assign to larger var with implicit conversion
    val d= c.toLong()   // this is ok

    val l = 1L + 3 // Long + Int => Long

    println(1 + 2)
    println(2_500_000_000L - 1L)
    println(3.14 * 2.71)
    println(10.0 / 3)


    val x = 5 / 2   // div between two ints returns Int only, discards decimal value
    //println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
    println(x == 2)

    val xL = 5L / 2     //returns Long
    println(xL == 2L)   // ok.

    val xF = 5 / 2.toDouble()   // returned int converted to double
    println(xF == 2.5)          // checks for equals for both double
}