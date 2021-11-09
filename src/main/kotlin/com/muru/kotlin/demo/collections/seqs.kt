package com.muru.kotlin.demo.collections

import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

fun main() {
    var list = generateSequence(1) { it+1 }.take(5_000).toList()
    println(list.size)
    var nanoTime = measureNanoTime {
        generateSequence(1) { it+1 }.take(5_000).toList()   //List
            .filter { it%2 == 0}
            .average()
        }
    println(TimeUnit.NANOSECONDS.toMillis(nanoTime))

    nanoTime = measureNanoTime {
        generateSequence(1) { it+1 }.take(5_000)        // Sequence, no list
            .filter { it%2 == 0}                                // takes less time
            .average()
    }
    println(TimeUnit.NANOSECONDS.toMillis(nanoTime))

    //list filters are sequential with whole list of elements in each filter
    listOf("a", "b", "c")
        .filter {
            println("filter one")
            true
        }
        .filter {
            println("filter two")
            true
        }
        .forEach { println(it) }

    //sequence filters are sequential for each element
    sequenceOf("a", "b", "c")       //
        .filter {
            println("seq filter one")
            true
        }
        .filter {
            println("seq filter two")
            true
        }
        .forEach { println(it) }
}
