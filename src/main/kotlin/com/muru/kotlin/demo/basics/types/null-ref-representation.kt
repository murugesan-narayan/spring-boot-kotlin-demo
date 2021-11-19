package com.muru.kotlin.demo.basics.types

fun main() {
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    //JVM applies same reference to Integer's between -128 and 127
    println(boxedA === anotherBoxedA) // true

    //not the same ref for this case
    println(boxedB === anotherBoxedB) // false
    println(boxedB == anotherBoxedB) // Prints 'true' it checks value equality

}