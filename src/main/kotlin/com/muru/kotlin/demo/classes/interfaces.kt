package com.muru.kotlin.demo.classes

fun main() {
    var sh: Shape
    sh = Rectangle(2, 3)
    println(sh.area())

    sh = Square(2)
    println(sh.area())

    sh = object: Shape {            //in-line implementation
        override fun area(): Int {
            return 1
        }
    }
}

//we can NOT create instance of interface
//all methods are public and abstract
interface Shape {
    fun area(): Int
}

class Rectangle(private val length: Int, private val breadth: Int): Shape {
    override fun area(): Int {
        return length * breadth
    }
}

class Square(private val length: Int): Shape {
    override fun area(): Int {
        return length * length
    }
}

