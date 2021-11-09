package com.muru.kotlin.demo.classes

fun main() {
    var p = Person("Rand", "Sandy")
    println(p.component1())
    println(p.component2())

    val (firstName, lastName) = p       //de-structuring
    println("$firstName $lastName")
    val pc = p.copy()
    println(pc)
    println(p.copy(firstName = "Sam"))
    println(p.firstName)

    var p1 = PersonOne("Ren", "Martin")
    //val (firstName1, lastName1) = p1      // normal classes do not have de-structuring option

    val pair = Pair("age", 16)              // in-built data class for two args
    println(pair.first)
    println(pair.second)

    val pair2 = "age" to 16                 // creates in-fix pair
    println(pair.first)
    println(pair.second)

    val triple = Triple("Ran", 25, false);
    println(triple.first)
    println(triple.second)
    println(triple.third)



}

data class Person(var firstName: String, var lastName: String)

class PersonOne(var firstName: String, var lastName: String)
