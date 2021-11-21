package com.muru.kotlin.demo.inheritance

fun main() {
    val fr = FilledRectangle()
    fr.draw()
}

open class RectangleC {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

class FilledRectangle : RectangleC() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor
}

class FilledRectangleI: RectangleC() {
    override fun draw() {
        val filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler {
        fun fill() { println("Filling") }
        fun drawAndFill() {
            super@FilledRectangleI.draw() // Calls Rectangle's implementation of draw()
            fill()
            println("Drawn a filled rectangle with color ${super@FilledRectangleI.borderColor}") // Uses Rectangle's implementation of borderColor's get()
        }
    }
}

interface Polygon {
    fun draw() { /* ... */ } // interface members are 'open' by default
}

class Square() : RectangleC(), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<RectangleC>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
    }
}