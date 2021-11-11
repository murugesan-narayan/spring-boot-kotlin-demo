package com.muru.kotlin.demo.basics
//variables can be used for reassigning values
fun main() {
    var name = "Ram"        //mutable
    println(name)
    name = "Ganesh"
    println(name.isEmpty())

    var age = 32
    println(age);

    var street: String      //declaration without init
    //println(street)         //ERROR: var must be initialized before
    street = "test"
    println(street)

}