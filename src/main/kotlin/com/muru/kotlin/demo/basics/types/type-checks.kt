package com.muru.kotlin.demo.basics.types

fun main() {
    var obj = "test"

    if (obj is String) {
        print(obj.length)
    }

    if (obj !is String) { // same as !(obj is String)
        print("Not a String")
    } else {
        print(obj.length)       // obj is automatically cast to String
    }

    var x: Any = "test"
    // x is automatically cast to String on the right-hand side of `||`
    if (x !is String || x.isEmpty()) return

    // x is automatically cast to String on the right-hand side of `&&`
    if (x is String && x.isNotEmpty()) {
        print(x.length) // x is automatically cast to String
    }

    when (x) {
        is Int -> print(x + 1)
        is String -> print(x.length + 1)
        is IntArray -> print(x.sum())
    }
    //Un-safe cast
    fun unsafeCast(y: Any) {
        val x: String = y as String // throws an exception if the cast isn't possible or null
        val z: String? = y as String? //
    }
    println("------------")
    unsafeCast("unsafe cast")
    println("------------2")
    val u = try {
        unsafeCast(Pair(1,2))
    } catch (e: Exception) {
        e.message
    }
    println(u)
}



fun demo(x: Any) {
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }
}