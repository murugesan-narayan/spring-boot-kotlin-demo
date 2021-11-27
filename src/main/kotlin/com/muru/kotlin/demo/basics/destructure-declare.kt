package com.muru.kotlin.demo.basics

fun findMinMax(list: List<Int>): Pair<Int, Int> {
    // do the math
    return Pair(50, 100)
}

fun main() {
    val (x, y, z) = arrayOf(5, 10, 15)                              // 1
    println("$x $y $z")
    val map = mapOf("Alice" to 21, "Bob" to 25)
    for ((name, age) in map) {     // Destructuring declarations also work in for -loops
        println("$name is $age years old")
    }

    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))    // 3
    println("$min $max")

    println("-----------------")
    val user = getUser()
    val (username, email) = user   // 2
    // A destructuring declaration is compiled down to the following code:
    // val username = user.component1()
    // val email = user.component2()
    println("$username $email")
    println(username == user.component1())                  // 3

    val (_, emailAddress) = getUser()       // destructuring based on components method
    println("$emailAddress")                // so if you do not want a field use '_'
    println("-----------------")

    val (num, name) = CustomPair(1, "one")             //custom pair object being restructured
    println("num = $num, name = $name")

    println("-----------------")

    for ((key, value) in mapOf(1 to "1")) { // destructuring in map
        // do something with the key and the value
    }
}

// data classes automatically declare componentN() functions,
// destructuring declarations work
data class User(val username: String, val email: String)    // 1

fun getUser() = User("Mary", "mary@somewhere.com")

class CustomPair<K, V>(private val first: K, private val second: V) {  // 1
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}