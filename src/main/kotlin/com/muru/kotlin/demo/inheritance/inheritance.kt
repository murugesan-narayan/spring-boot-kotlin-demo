package com.muru.kotlin.demo.inheritance

fun main() {
    var p = Person("Nash", 25)
    println(p.name)
    println(p.getNameWithTitle())

    p = Manager("Mark", 35)
    println(p.name)
    println(p.getNameWithTitle())
}

//super class - which can be extendable. we need to declare as open,
//otherwise by default it is final
open class Person(var name: String, var age: Int) {

    //protected variable is available at sub-class
    protected var title: String = "Mr"

    //functions by default final, mention it as open if override is possible
    open fun getNameWithTitle() = "$title.$name"
}

//extends Person class
class Manager(name: String, age: Int) : Person(name, age) {
    override fun getNameWithTitle() = "$title.$name, Team Manager"
}

// Implicitly inherits from Any
// 'Any' has three methods: equals(), hashCode(), and toString()
// By default, Kotlin classes are final – they can’t be inherited
class Example

//  To make a class inheritable, mark it with the open keyword
open class Base // Class is open for inheritance

//super class constructor can be called like below
class MyView : Base() {
    //constructor(ctx: Context) : super(ctx)

    //constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}

