package com.muru.kotlin.demo.classes

fun main() {
    var out = Outer()
    out.info()

    var inner = out.Inner()
    inner.info()
}

class Outer {
    var outerName: String = "Outer Name"
    fun info() = println(outerName)
    // A nested class marked as inner can access the members of its outer class
    inner class Inner {
        private var innerName: String = "Inner Name"
        fun info() = println("$outerName-$innerName")
    }

    class SecInner {
        var secInnerName: String = "Inner Name"
        //fun info() = println("$outerName-$secInnerName")    // inner is not specified so,
                                                            // we can not access parent class fields.


    }
}

// You can also use interfaces with nesting. All combinations of classes and interfaces are possible
interface OuterInterface {
    class InnerClass
    interface InnerInterface
}

class OuterClass {
    class InnerClass
    interface InnerInterface
}
