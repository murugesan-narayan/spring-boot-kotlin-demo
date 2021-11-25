package com.muru.kotlin.demo.objects

interface Factory<T> {
    fun create(): T
}

class MyClassF {
    companion object : Factory<MyClassF> {      // companion inherits Factory
        override fun create(): MyClassF = MyClassF()
    }
}
// even though the members of companion objects look like static members in other languages,
// at runtime those are still instance members of real objects
fun main() {
    val f: Factory<MyClassF> = MyClassF // MyClassF also a Factory
    println(MyClassT.getName())
}

// on the JVM you can have members of companion objects generated as real static methods
// and fields if you use the @JvmStatic annotation
class MyClassT {
    companion object {
        @JvmStatic
        fun getName() = "Companion"
    }
}
