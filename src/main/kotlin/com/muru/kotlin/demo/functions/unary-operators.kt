package com.muru.kotlin.demo.functions

import kotlin.math.absoluteValue

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)
operator fun Point.unaryPlus() = Point(x.absoluteValue, y.absoluteValue)
operator fun Point.not() = Point(-x, -y)
operator fun Point.inc() = Point(x+1, y+1)
operator fun Point.dec() = Point(x-1, y-1)



fun main() {
    var point = Point(10, 20)
    point = -point
    println(point)      // prints "Point(x=-10, y=-20)"
    point = +point
    println(point)      // all positive
    point = ! point
    println(point)      //all negative
    point = !Point(-10, 20)
    println(point)      //Point(x=10, y=-20)

    println("--------------")
    point++
    println(point)    // Point(x=11, y=-19)
    point--
    point--
    println(point)    // Point(x=9, y=-21)
}
