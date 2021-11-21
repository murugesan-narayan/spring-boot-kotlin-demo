package com.muru.kotlin.demo.inheritance

fun main() {
    println("Constructing the derived class(\"hello\", \"world\")")
    Derived("hello", "world")
}

// Kotlin requires explicit modifiers for overridable members and overrides
open class Shape {
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }
    open val vertexCount: Int = 0
}

class Circle() : Shape() {
    override fun draw() { /*...*/ }     //overrides draw method
}

// The overriding mechanism works on properties in the same way that it does on methods.
// You can also override a val property with a var property, but not vice versa
class Rectangle : Shape() {
    override val vertexCount = 4
}

open class BaseV(val name: String) {

    init { println("Initializing a base class") }

    open val size: Int =
        name.length.also { println("Initializing size in the base class: $it") }
}

class Derived(
    name: String,
    val lastName: String,
) : BaseV(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }) {

    init { println("Initializing a derived class") }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
}