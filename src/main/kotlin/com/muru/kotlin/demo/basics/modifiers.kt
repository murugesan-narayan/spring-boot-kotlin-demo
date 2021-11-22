package com.muru.kotlin.demo.basics

// There are four visibility modifiers in Kotlin:
// private, protected, internal, and public. The default visibility is public.
fun main() {

}

// top level members are directly inside package
// If you don’t use a visibility modifier,
// public is used by default, which means that your declarations will be visible everywhere
fun baz() {  }

// If you mark a declaration as private,
// it will only be visible inside the file that contains the declaration.
private class Bar {
}

open class BarOpen {
    // members declared inside a class can have private, protected, internal, public
    // protected modifier is similar to private, additionally visible to sub-classes.
    protected var i: Int = 1

    // If you override a protected or an internal member and
    // do not specify the visibility explicitly, the overriding member will also
    // have the same visibility as the original.
}

// By default, all constructors are public
// you can add visibility of the primary constructor of a class
class C private constructor(a: Int) {  }

// If you mark it as internal, it will be visible everywhere in the same module.
internal fun barFun() {  }

// The protected modifier is not available for top-level declarations.
//protected fun testPro() {}  //Error

