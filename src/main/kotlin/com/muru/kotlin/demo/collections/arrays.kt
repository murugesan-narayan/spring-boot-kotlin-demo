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



}