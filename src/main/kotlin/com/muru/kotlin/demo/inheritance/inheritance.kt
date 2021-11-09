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
