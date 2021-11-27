package com.muru.kotlin.demo.reflection

import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter

class A(val p: Int)

fun main() {
    println(A::p.javaGetter) // prints "public final int A.getP()"
    println(A::p.javaField)  // prints "private final int A.p"
}
