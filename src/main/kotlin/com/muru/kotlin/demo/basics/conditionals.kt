package com.muru.kotlin.demo.basics

fun main() {
    var d = 5

    if (d>5) println("Bigger than 5");
    else if (d>3) println("Bigger than 3")
    else println("Small")


    var name = "Mark";
    when (name) {
        "Mark" -> {println("This is Mark")}
        "Dwayne" -> println("This is Dwayne")
        else -> println("This is some one else")
    }
    when {
        name == "Mark" && d == 5 -> {println("This is Mark")}
        name == "Dwayne" -> println("This is Dwayne")
        //else -> println("This is someone else")   // here no need to have else-block
                                                    // we are not assigning its return value.
    }

    val grade = when (name) {           // it should cover all the possible values
                                        // otherwise else condition is must else compiler error
        "Mark" -> 5
        "Dwayne" -> 6
        else -> 7
    }
    println(grade)

    var i = 6
    if (i in 1..5) println("I within 1 to 5")   //both inclusive
    else println("I not within 1 to 5")

    var k: String? = "test"
    if (k is String) println("String")
    k = null
    if (k !is String) println("NOT String")
}
