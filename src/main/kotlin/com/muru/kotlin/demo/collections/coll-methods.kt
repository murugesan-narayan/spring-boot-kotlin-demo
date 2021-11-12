package com.muru.kotlin.demo.collections

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1

    val positives = numbers.filter { x -> x > 0 }  // 2
    println(positives)

    val negatives = numbers.filter { it < 0 }      // 3
    println(negatives)

    println("-------------")

    val doubled = numbers.map { x -> x * 2 }
    println(doubled)

    val tripled = numbers.map { it * 3 }
    println(tripled)

    println("-------------")

    // returns true if the collection contains at least one element that matches the given predicate
    val anyNegative = numbers.any { it < 0 }             // 2
    println(anyNegative)

    val anyGT6 = numbers.any { it > 6 }
    println(anyGT6)

    println("-------------")

    // returns true if all elements in collection match the given predicate.
    val allEven = numbers.all { it % 2 == 0 }            // 2
    println(allEven)

    val allLess6 = numbers.all { it < 6 }
    println(allLess6)

    println("-------------")

    //returns true if there are no elements that match the given predicate in the collection
    val isAllEven = numbers.none { it % 2 == 1 }           // 2
    println(isAllEven)

    val isAllLess6 = numbers.none { it > 6 }
    println(isAllLess6)

    println("-------------")

    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1

    // return the first or the last collection element that matches the given predicate.
    // If there are no such elements, functions return null.
    val first = words.find { it.startsWith("some") }                                // 2
    val last = words.findLast { it.startsWith("some") }                             // 3

    val nothing = words.find { it.contains("nothing") }
    println("$first $last $nothing")

    println("-------------")

    val firstN = numbers.first()                          // 2
    val lastN = numbers.last()
    println("$firstN $lastN")

    println("-------------")

    val wordsList = listOf("foo", "bar", "baz", "faz")         // 1
    val empty = emptyList<String>()                        // 2

    val firstE = empty.firstOrNull()                        // null
    val lastE = empty.lastOrNull()                          // null

    val firstF = wordsList.firstOrNull { it.startsWith('f') }  // foo
    val firstZ = wordsList.firstOrNull { it.startsWith('z') }  // null
    val lastF = wordsList.lastOrNull { it.endsWith('f') }      // null
    val lastZ = wordsList.lastOrNull { it.endsWith('z') }      // faz

    println("$firstE $lastE $firstF $firstZ $lastF $lastZ")
    println("-------------")

    val totalCount = numbers.count()                     // counts total number of elements
    val evenCount = numbers.count { it % 2 == 0 }        // number of  even valued elements

    println("$numbers $totalCount $evenCount")

    println("-------------")
}
