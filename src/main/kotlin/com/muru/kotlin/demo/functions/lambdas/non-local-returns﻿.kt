package com.muru.kotlin.demo.functions.lambdas

fun ordinaryFunction(block: () -> Unit) {
    println("hi!")
}

// A bare return is forbidden inside a lambda because a lambda cannot make
// the enclosing function return
fun foo() {
    ordinaryFunction {
        //return // ERROR: cannot make `foo` return here
    }
}

fun main() {
    foo()
    fooInline()
}

inline fun inlined(block: () -> Unit) {
    println("hi!")
}

//  if the function the lambda is passed to is inlined, the return can be inlined, as well
fun fooInline() {
    inlined {
        return // OK: the lambda is inlined
    }
}

fun hasZeros(ints: List<Int>): Boolean {
    ints.forEach {
        if (it == 0) return true // returns from hasZeros
    }
    return false
}
