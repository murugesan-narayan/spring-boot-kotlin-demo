package com.muru.kotlin.demo.basics

fun main() {
    val myByte: Byte = 6 // 8-bit signed integer
    val myShort: Short = 65 // 16-bit signed integer
    val myInt: Int = 3278 // 32-bit signed integer
    val myLong: Long = 327_889_238 // 64-bit signed integer
                                    // can use underscore
    val myFloat: Float = 3278.23f // 32-bit floating point number
    val myDouble: Double = 323232278.23 // 32-bit floating point number

    var myNum = myLong+1
    println(myNum)
    myNum = myNum.plus(1)
    println(myNum)
    println(myByte.div(3))
    println(myByte.rem(5))
    println(myByte.times(2))

}