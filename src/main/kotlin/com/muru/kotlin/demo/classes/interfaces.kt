package com.muru.kotlin.demo.classes

fun main() {
    var sh: Shape
    sh = Rectangle(2, 3)
    println(sh.area())

    sh = Square(2)
    println(sh.area())

    sh = object: Shape {            //in-line implementation
        override val version = 1
        override fun area(): Int {
            return 1
        }
    }
}

// we can NOT create instance of interface
// all methods are public and abstract
// But, we can also have method implementations
// They can have properties, but these need to be abstract
// or provide accessor implementations.
interface Shape {
    val version: Int // abstract
    val propertyWithImplementation: String
        get() = "foo"           // provided accessor
    fun area(): Int
    fun color(): String = "black"
}

class Rectangle(private val length: Int, private val breadth: Int): Shape {
    override val version: Int
        get() = 1

    override fun area(): Int {
        return length * breadth
    }
}

class Square(private val length: Int): Shape {
    override val version: Int
        get() = 1
    override fun area(): Int {
        return length * length
    }
}

interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()      //referring respective super methods
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}