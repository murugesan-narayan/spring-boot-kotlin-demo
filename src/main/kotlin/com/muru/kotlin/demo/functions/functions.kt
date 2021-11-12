package com.muru.kotlin.demo.functions

fun hi(): Unit {
    println("Hi...")
    nested()
}

fun main() {
    hello()
    hi()
    var result = add(1,3)
    println(result)
    s_hello()
    isGreater(1,3)
    compareAndPrint(5, 6)
    personDetails("Ralf", 32, false)

    //we can use named arguments
    personDetails(name="Sam", age = 32, isMarried = false)
    personDetails(age = 32, isMarried = false, name="Sam")  //switching with named is Ok.

    greet()     // takes default name
    greet("Roger")      //takes passed name

    printFriends("Kane", "Willy", "Mills", age= 23)      //takes varargs
                                                                // after that we can use other named params
    printFriends("Kane", "Willy", "Mills","Kane2", "Willy2", "Mills2", age = 22)      //takes varargs


}

fun hello() {               //default function return type Unit
    println("Hello world")
}

fun s_hello() = println("Hello..")          //single statement function.

fun add(a: Int, b: Int): Int {
    return a +b ;
}

fun nested() {
    //n_hi()        //we can not use it before declare
    fun n_hi(): String {
        return "Hi"
    }
    fun there(): String {
        return "there,"
    }
    fun how(): String {
        return "How are you?"
    }
    println("${n_hi()} ${there()} ${how()}")
}

fun isGreater(a: Int, b: Int): Boolean = a > b;

//single line function with if else. here else is must.
fun compareAndPrint(a: Int, b: Int) = if (a > b) println("A greater")
                                        else println("B greater or equal")

fun personDetails(name: String, age: Int, isMarried: Boolean) {
    println("$name $age $isMarried ")
}

fun greet(name: String = "Guest") {
    println("Hello $name, Welcome to Kotlin")
}

fun printFriends(vararg friends: String, age: Int) {
    friends.forEach { println(it) }
    println("Friends average age is $age")
}
