package com.muru.kotlin.demo.functions

fun read(
    b: ByteArray,   // mandatory arg
    off: Int = 0,   // default value
    len: Int = b.size, // default value with mandatory arg
) {
    println("$b $off $len")
}

fun foo(
    bar: Int = 0,
    baz: Int,
) { /*...*/ }

open class A {
    open fun foo(i: Int = 10) = i
}

class B : A() {
    // No default value is allowed while override, it takes the value from base method
    // override fun foo(i: Int = 5) { /*...*/ }  // ERROR
    override fun foo(i: Int) = i+1   // No default value is allowed.
}

fun main() {
    read(byteArrayOf(1,2))
    foo(baz = 1)    // The default value bar = 0 is used
    println(B().foo())
}
