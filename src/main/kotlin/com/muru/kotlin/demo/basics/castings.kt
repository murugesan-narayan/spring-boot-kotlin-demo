package com.muru.kotlin.demo.basics

fun main() {
    var c: Any? = 1
    var i = c as Int
    println(i)

    var c1 = "test"
    var i1 = c1 as? Int     //no class cast error, return null
    println(i1)
}