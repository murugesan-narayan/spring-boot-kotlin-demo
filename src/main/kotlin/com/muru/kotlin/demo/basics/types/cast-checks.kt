package com.muru.kotlin.demo.basics.types

fun main() {

    var y: Any? = "test"
    var x: String = y as String
    println(x)

    // throws an exception if the cast isn't possible or null
    y = Pair(1,2)
    //x = y as String   //Err: class kotlin.Pair cannot be cast to class java.lang.String

    //safe cast
    val xA: String? = y as? String  //OK it casts to null if cast not possible
    println(xA)

    y = null
    //x = y as String   //Error: null cannot be cast to non-null type kotlin.String
    var xN = y as String?   // OK. now it casts
    println(xN)

    var something = listOf(1,2)
    if (something is List<*>) {
        something.forEach { println(it) } // The items are typed as `Any?`
    }

}
