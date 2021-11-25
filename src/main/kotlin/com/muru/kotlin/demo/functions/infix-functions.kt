package com.muru.kotlin.demo.functions

// Functions marked with the infix keyword can also be called using the infix notation
// In-fix Notation - (omitting the dot and the parentheses for the call)

// conditions for infix
// 1. They must have a single parameter
// 2. They must be member functions or extension functions
// 3. The parameter must not accept variable number of arguments and must have no default value.

fun main() {
    infix fun Int.pair(int: Int) = println(Pair(this, int))
    5 pair 6

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

class MyStringCollection {
    infix fun add(s: String) { /*...*/ }

    fun build() {
        this add "abc"   // Correct
        add("abc")       // Correct
        //add "abc"        // Incorrect: the receiver must be specified
    }
}
