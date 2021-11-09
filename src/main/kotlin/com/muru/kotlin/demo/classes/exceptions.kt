package com.muru.kotlin.demo.classes

fun main() {
    try {
        checkPlant()
    } catch (e: MinAgeRequiredException) {
        println(e.message)
    } finally {
        println("done")
    }
}

data class Plant(var name:String, var age: Int)

class MinAgeRequiredException(var age: Int, message: String) : Exception("$message. Age: $age. Minimum Age: 13")

fun checkPlant() {
    val p = Plant("Jasmin", 2)
    if (p.age < 12) throw MinAgeRequiredException(p.age, "Plant should NOT be cut down")
}