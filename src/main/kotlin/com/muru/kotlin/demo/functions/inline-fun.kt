package com.muru.kotlin.demo.functions

import java.util.concurrent.locks.Lock

// Using higher-order functions imposes certain runtime penalties:
// each function is an object, and it captures a closure.
// A closure is a scope of variables that can be accessed in the body of the function.
// Memory allocations (both for function objects and classes) and
// virtual calls introduce runtime overhead.

// this kind of overhead can be eliminated by inlining the lambda expressions
inline fun <T> lock(lock: Lock, body: () -> T): T {
    return body()
}

// If you don’t want all the lambdas passed to an inline function to be inlined,
// mark some of your function parameters with the noinline modifier
inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) { notInlined() }

