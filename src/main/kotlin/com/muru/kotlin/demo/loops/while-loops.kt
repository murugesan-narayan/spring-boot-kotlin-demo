package com.muru.kotlin.demo.loops

fun main() {
    var n = 1;
    while (n < 11) {
        println(n++);
    }

    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")

    println("------------------")

    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {                   // when expression, should return a value
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> false                        // 4
        else -> 42      // it is NOT optional, require default as we need to return some value.
                        //some enum kind of classes, if all possible values are covered then no issues
    }
    return result
}

fun cases(obj: Any) {
    when (obj) {                                     // check until one of them is satisfied
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Unknown")                   // optional
    }
}

class MyClass