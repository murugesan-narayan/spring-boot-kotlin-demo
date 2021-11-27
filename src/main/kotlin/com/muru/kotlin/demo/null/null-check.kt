package com.muru.kotlin.demo.`null`

fun main() {
    var b: String? = "abc" // can be set to null
    val l = if (b != null) b.length else -1
    println(b?.length)  //safe call
    if (b != null && b.isNotEmpty()) {
        print("String of length ${b.length}")
    } else {
        print("Empty string")
    }

    val a = "Kotlin"
    println(a?.length) // Unnecessary safe call

    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }

    b = b?.substringAfter("/")
    println(b)

    //not-null assertion operator (!!) converts any value to a non-null type and
    // throws an exception if the value is null
    val l2 = b!!.length
    println(l2)

    val bInt: Int? = b as? Int  //safe cast, if not possible returns null
    println(bInt)

    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)
}