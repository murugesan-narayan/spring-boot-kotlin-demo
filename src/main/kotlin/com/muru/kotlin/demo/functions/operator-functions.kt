package com.muru.kotlin.demo.functions

//in infix, instead of method name operator is used in between operands
fun main() {
    operator fun Int.times(str: String) = str.repeat(this) // this refers to int on which times called
    println(2 * "Bye ")                                // Bye Bye     //times -> * operator

    operator fun String.get(range: IntRange) = substring(range)  // get(range) -> [a..b] -> bracket-access
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])
}

interface IndexedContainer {
    operator fun get(index: Int)
}
// To overload an operator, mark the corresponding function with the operator modifier
class OrdersList: IndexedContainer {
    //When overriding your operator overloads, you can omit operator
    override fun get(index: Int) { /*...*/ }
}
