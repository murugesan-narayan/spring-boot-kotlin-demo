package com.muru.kotlin.demo.classes

fun main() {
    var name = "Ran Bastian"
    var a = name.abbreviate()
    println(a)

    var i = 15

    println(i.isAdult())
}

fun String.abbreviate(): String {
    val split = this.split(Regex("[\\s]"))
    return split.joinToString(separator = ".") { it[0].toString() }
}

fun Int.isAdult(): Boolean {
    return this > 17
}
