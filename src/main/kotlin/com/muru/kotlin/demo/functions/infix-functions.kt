package com.muru.kotlin.demo.functions

//in infix, method name is used in between operands
fun main() {
    infix fun Int.times(str: String) = str.repeat(this) // this refers to int on which times called
    println(2 times "Bye ")                                // Bye Bye

    val pair = "Ferrari" to "Katrina"
    println(pair)                                          // (Ferrari, Katrina)

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)                                        // (McLaren, Lucas)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}

class Person(val name: String) {
    private val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) = likedPeople.add(other)   // 6
}

