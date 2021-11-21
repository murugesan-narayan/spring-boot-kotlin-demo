package com.muru.kotlin.demo.classes

fun main() {
    InitOrderDemo("hello")
    Constructors(1)
}

//valid class
class Empty

//class with constructor
class PersonC constructor(firstName: String) { /*...*/ }

// If the primary constructor does not have any annotations or visibility modifiers,
// the constructor keyword can be omitted:
class PersonD(firstName: String) { /*...*/ }

//constructor parameters can have default value
// trailing comma allowed at the end
class PersonE(val firstName: String, var isEmployed: Boolean = true,)

// During the initialization of an instance, the initializer blocks are executed
// in the same order as they appear in the class body,
// interleaved with the property initializers:
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")  // constructor parameter can be used
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

class PersonP(val pets: MutableList<Pet> = mutableListOf())

class Pet {
    constructor(owner: PersonP) {
        owner.pets.add(this) // adds this pet to the list of its owner's pets
    }
}

// If the class has a primary constructor, each secondary constructor needs to delegate
// to the primary constructor, either directly or indirectly
// through another secondary constructor(s).
class PersonPC(val name: String) {
    val children: MutableList<PersonPC> = mutableListOf()
    constructor(name: String, parent: PersonPC) : this(name) {  //calling primary constructor as well.
        parent.children.add(this)
    }
}

// Even if the class has no primary constructor,
// the delegation still happens implicitly, and
// the initializer blocks are still executed:
class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor $i")
    }
}

// If a non-abstract class does not declare any constructors (primary or secondary),
// it will have a generated primary constructor with no arguments.
// The visibility of the constructor will be public.
// If you don't want your class to have a public constructor,
// declare an empty primary constructor with non-default visibility:
class DontCreateMe private constructor () { /*...*/ }

//abstract class, by default open
abstract class Polygon {
    abstract fun draw()
}

class RectangleA : Polygon() {
    override fun draw() {
        // draw the rectangle
    }
}

//You can override a non-abstract open member with an abstract one.
open class PolygonW {
    open fun draw() {
        // some default polygon drawing method
    }
}

abstract class WildShape : PolygonW() { // inherits PolygonW
    // Classes that inherit WildShape need to provide their own
    // draw method instead of using the default on Polygon
    abstract override fun draw()
}
