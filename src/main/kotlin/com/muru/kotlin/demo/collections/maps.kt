package com.muru.kotlin.demo.collections

fun main() {
    var m = mutableMapOf("Berlin" to "2m", "Frankfurt" to "1m" )
    var p = m["Berlin"]
    println(p)

    println(m.getOrDefault("NewYork", "undefined"))
    println(m.getOrElse("NewYork") { "NewYork undefined" })

    println(m["NewYork"]?:"Undefined")

    m["NewYork"] = "7m"
    m.put("Hamburg", "3m")

    m.putIfAbsent("Berlin", "3m")
    m.remove("NewYork")
    m.getOrPut("NewYork") { "Undefined" }
    println(m)
    println(m.any())

    println(m.filterKeys { it.startsWith("B") })
    println(m.filterValues { it == "Undefined" })

    m.clear()
    println(m.none())

}