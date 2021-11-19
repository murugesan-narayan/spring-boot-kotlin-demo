package com.muru.kotlin.demo.basics.types

fun main() {
    var aChar: Char = 'a'

    println(aChar)
    println('\n') //prints an extra newline character
    println('\uFF00')

    aChar = '1'
    println(aChar.digitToInt())
}