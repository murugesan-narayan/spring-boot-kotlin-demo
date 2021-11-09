package com.muru.kotlin.demo.collections

import kotlin.reflect.typeOf

//default lists are immutable
fun main() {
    var items = listOf(1,2,3)
    items.forEach {println(it)}
    println()

    println(items.first())
    println(items.last())

    println()
    var pItems = listOf(Pair("name", 1), Pair(1, true))
    pItems.forEach {println(it)}

    var eList = emptyList<String>()
    println(eList.firstOrNull())

    println()
    var mList = mutableListOf("l1", "l2", "l3")
    println(mList.add("l5"))
    println(mList.remove("l2"))
    println(mList)

    println()
    mList[1] = "l2"
    println(mList)
    println(mList[2])

    var fList = listOf(1, 5, 12, 15, 22)
    println(fList.filter(::isAdult))

    println(fList.filterNot(::isAdult))

    println()
    var l1 = listOf(1,2,3)
    var l2 = listOf("a","b","c")
    println(listOf(l1,l2))
    println(listOf(l1,l2).flatten())
    var l3 = l1.plus(l2)
    println(l3)            //adding elements
    println(l3.minus(l2))

    var l5 = l3.map {
        when (it) {
            is String -> it.uppercase()
            else -> it.toString()
        }
    }
    println(l5)


    var li = listOf("test1", "test2")
    li.forEachIndexed { index, s -> println("Index $index has value $s") }

    var listN = listOf("test1", null, "test2", null)
    println(listN.filterNotNull())
}

fun isAdult(age: Int): Boolean {
    return age >= 18
}


