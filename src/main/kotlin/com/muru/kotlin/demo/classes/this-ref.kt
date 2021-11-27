package com.muru.kotlin.demo.classes

// 1. In a member of a class, this refers to the current object of that class.
// 2. In an extension function or a function literal with receiver this denotes the receiver parameter
//    that is passed on the left-hand side of a dot.

class AC { // implicit label @A
    inner class B { // implicit label @B
        fun Int.foo() { // implicit label @foo
            val a = this@AC // AC's this
            val b = this@B // B's this

            val c = this // foo()'s receiver, an Int
            val c1 = this@foo // foo()'s receiver, an Int

            val funLit = lambda@ fun String.() {
                val d = this // funLit's receiver
            }

            val funLit2 = { s: String ->
                // foo()'s receiver, since enclosing lambda expression
                // doesn't have any receiver
                val d1 = this
            }
        }
    }
}
