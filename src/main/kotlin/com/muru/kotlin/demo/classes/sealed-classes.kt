package com.muru.kotlin.demo.classes

fun main() {
    println(greetMammal(Cat("Snowy")))
}

//can only be subclassed from inside the same package
//It cannot be subclassed out-side of the package
sealed class Mammal(val name: String)                                                   // 1

class Cat(val catName: String) : Mammal(catName)                                        // 2
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {                                                                     // 3
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4
        is Cat -> return "Hello ${mammal.name}"                                         // 5
    }                                                                                   // 6
}

// Direct subclasses of sealed classes and interfaces must be declared in the same package
sealed class IOError {
    constructor() { /*...*/ } // protected by default
    private constructor(description: String): this() { /*...*/ } // private is OK
    // public constructor(code: Int): this() {} // Error: public and internal are not allowed
}

sealed interface Error // has implementations only in same package and module

open class CustomError(): Error // can be extended wherever it's visible

fun log(e: Error) = when(e) {
    is IOError -> { println("Error while reading file ${e}") }
    is CustomError -> { println("Error while reading from database ${e}") }
    // the `else` clause is not required because all the cases are covered
}