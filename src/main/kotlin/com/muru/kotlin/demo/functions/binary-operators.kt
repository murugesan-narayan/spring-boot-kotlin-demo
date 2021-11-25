package com.muru.kotlin.demo.functions

data class Counter(val dayIndex: Int) {
    operator fun plus(increment: Int) = Counter(dayIndex + increment)
    operator fun minus(decrement: Int) = Counter(dayIndex - decrement)
    operator fun times(n: Int) = Counter(dayIndex * n)
    operator fun div(n: Int) = Counter(dayIndex / n)
    operator fun rem(n: Int) = Counter(dayIndex % n)
//    operator fun rangeTo(n: Int) = Counter(dayIndex % n)

}

fun main() {
    var c = Counter(1)
    println(c + 1)
    println(c - 1)
    println(Counter(6) / 2)
    println(Counter(12) % 5)
}
