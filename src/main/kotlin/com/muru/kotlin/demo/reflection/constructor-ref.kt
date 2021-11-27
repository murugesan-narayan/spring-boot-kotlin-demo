package com.muru.kotlin.demo.reflection

class Foo

fun function(factory: () -> Foo): Foo {
    val x: Foo = factory()
    return x
}

class Outer {
    inner class Inner
}

fun main() {
    var v = function(::Foo)     // ::Foo refers to the default constructor
    println(v)

    val o = Outer()
    //reference to a constructor of an inner class can be obtained
    // by providing an instance of the outer class
    val boundInnerCtor = o::Inner
}
