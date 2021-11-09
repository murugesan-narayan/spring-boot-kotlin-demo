package com.muru.kotlin.demo.basics

fun main() {
    val name = geName()     //for val it is ok. but not for const val.
    println(name)

    println(Props.APP_NAME)

}

fun geName(): String {
    return "MyName"
}

// consts are compile time constants.
// Meaning that their value has to be assigned during compile time,
// unlike vals, where it can be done at runtime.

//This means, that consts can never be assigned to a function or any class constructor,
// but only to a String or primitive.
object Props {
    //const val APP_NAME: String = getName()    //this gives error
    const val APP_NAME = "CONST_APP"
    const val PORT = "3217"
    const val IP = "22.12.12.22"
    fun geName(): String {
        return "MyName"
    }
}
