package com.muru.kotlin.demo.basics

fun main() {
    var name: String = "Ganesh Murthy"
    println(name.length)

    val myChar = 'c'    //16 bit unicode character
    println(myChar)

    val myMsg = """
        Hi,
        How are you?
        Where are you?
    """.trimIndent()
    println(myMsg)

    val age = 75
    println("Hello $name, your age is $age")
    println("Hello $name, your name has ${name.length} chars")


    val name1 = "test"
    val name2 = "test"
    val name3 = "big"
    println(name1 == name2) //true
    println(name1.equals(name2)) //true

    println("ref eq: ${name1 === name2}")
    //true reference equality true for boolean, numbers, chars

    println(name1 == name3) //false
    println(name1 != name3) //true

    val name5 = Name("tes1t")
    val name6 = Name("test1")
    println(name6 !== name5) //ref equality for object is not same.

}

class Name(name: String)