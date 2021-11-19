package com.muru.kotlin.demo.collections

fun main() {
    var items = arrayOf(1,2,3)      //results in Array<Int>
    items.forEach { println(it) }

    var i_items = intArrayOf(1,2,3)          //results in IntArray
    i_items.forEach { println(it) }

    var d_items = doubleArrayOf(1.1,2.2,3.3)      //results in DoubleArray
    d_items.forEach { println(it) }

    var s_items = arrayOf("name", "age")          //results in Array<String>
    s_items.forEach { println(it) }

    var t_items = arrayOf(Pair("name", 1), Pair(1, true))   //Array<Pair>
    t_items.plus(Pair("ch", "rh"))
    println(t_items.get(0))
    println(t_items[0])

    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr = IntArray(5)

    // e.g. initialise the values in the array with a constant
    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr1 = IntArray(5) { 42 }

    // e.g. initialise the values in the array using a lambda
    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
    var arr2 = IntArray(5) { it * 1 }

    println(arr2.joinToString())
}