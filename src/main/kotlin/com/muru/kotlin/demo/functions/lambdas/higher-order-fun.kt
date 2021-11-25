package com.muru.kotlin.demo.functions.lambdas

//A higher-order function is a function that takes functions as parameters, or returns a function.

fun main() {
    var myFun = { a: Int, b: Int -> a + b } //a lambda expression, return type is inferred
    var myAnaFun = fun(a: Int, b: Int){ a + b } //an anonymous function

    // value of type (A, B) -> C can be passed or assigned
    // where a value of type A.(B) -> C is expected, and the other way around
    val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }
    val twoParameters: (String, Int) -> String = repeatFun // OK

    fun runTransformation(f: (String, Int) -> String): String {
        return f("hello", 3)
    }
    val result = runTransformation(repeatFun) // OK

    // A value of a function type can be invoked by using
    // its invoke(...) operator: f.invoke(x) or just f(x).
    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3)) // extension-like call
}

// function type as interface
class IntTransformer: (Int) -> Int {
    override operator fun invoke(x: Int): Int = TODO()
}
