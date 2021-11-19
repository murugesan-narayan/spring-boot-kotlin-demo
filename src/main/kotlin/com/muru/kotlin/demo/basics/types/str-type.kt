package com.muru.kotlin.demo.basics.types

fun main() {
    val str = "abcd 123"
    for (c in str) {
        println(c)
    }

    val str1 = "abcd"
    println(str1.uppercase()) // Create and print a new String object
    println(str1) // the original string remains the same

    val s = "abc" + 1
    println(s + "def")

    val s1 = "Hello, world!\nHow are you?"      //with escape char
    println(s1)

    //raw string
    val text = """
    for (c in "foo")
        print(c)
    """
    println(text)

    //By default, | is used as margin prefix
    val text1 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()

    println(text1)

    val i = 10
    println("i = $i") // prints "i = 10"

    val s3 = "abc"
    //expression in curly braces
    println("$s3.length is ${s3.length}") // prints "abc.length is 3"
}