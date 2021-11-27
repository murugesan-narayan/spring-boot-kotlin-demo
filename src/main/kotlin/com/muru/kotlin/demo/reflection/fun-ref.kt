package com.muru.kotlin.demo.reflection


fun isOdd(x: Int) = x % 2 != 0
fun isOdd(s: String) = s == "brillig" || s == "slithy" || s == "tove"

fun main() {
    val numbers = listOf(1, 2, 3)

    // pass function type value to another function
    println(numbers.filter(::isOdd))    //refers isOdd(x: Int)

    // if type is known clearly identify the overloaded functions
    var isOddFuncStr: (String) -> Boolean = ::isOdd //refers isOdd(s: String)

    // member of a class, or an extension function
    var helloFun: String.() -> Int? = String::toIntOrNull
    println("".helloFun())


    val numberRegex = "\\d+".toRegex()
    println(numberRegex.matches("29"))

    // ou can refer to an instance method of a particular object
    val isNumber = numberRegex::matches
    println(isNumber("29"))

    val strings = listOf("abc", "124", "a70")
    println(strings.filter(numberRegex::matches))

}