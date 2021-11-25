package com.muru.kotlin.demo.inheritance

interface BaseD {
    fun print()
    fun getName()
}

class BaseDImpl(val x: Int) : BaseD {
    override fun print() { println(x) }
    override fun getName() {
        print("BaseD")
    }
}

// A class Derived can implement an interface Base by delegating
// all of its public members to a specified object
class DerivedD(b: BaseD) : BaseD by b {
    // when you override no delegation happens,
    // just calls your implemented method
    override fun getName() {
        println("DerivedD")
    }
}

fun main() {
    val b = BaseDImpl(10)
    val d = DerivedD(b)
    d.print()
    d.getName()
}
