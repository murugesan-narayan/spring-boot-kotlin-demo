package com.muru.kotlin.demo.basics

fun main() {
    var a = 1
    var b = 2
    a = b.also { b = a }
    println(a)
    println(b)
}