package com.muru.kotlin.demo.classes

fun main() {
    // No actual instantiation of class 'Password' happens
    // At runtime 'securePassword' contains just 'String'
    val securePassword = Password("Don't try this in production")

    val name = Name("Kotlin")
    name.greet() // method `greet` is called as a static method
    println(name.length) // property getter is called as a static method

    val nameP = NameP("Kotlin")
    println(nameP.prettyPrint()) // Still called as a static method
}

// An inline class must have a single property initialized in the primary constructor.
// At runtime, instances of the inline class will be represented using this single property
@JvmInline
value class Password(private val s: String)


// they are allowed to declare properties and functions, and have the init block
// no late-init /delegated properties
@JvmInline
value class Name(val s: String) {
    init {
        require(s.length > 0) { }
    }

    val length: Int
        get() = s.length

    fun greet() {
        println("Hello, $s")
    }
}

interface Printable {
    fun prettyPrint(): String
}

// Inline classes are allowed to inherit from interfaces
@JvmInline
value class NameP(val s: String) : Printable {
    override fun prettyPrint(): String = "Let's $s!"
}
