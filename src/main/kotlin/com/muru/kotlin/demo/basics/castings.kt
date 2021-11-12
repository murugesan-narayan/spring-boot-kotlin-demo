package com.muru.kotlin.demo.basics

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

fun main() {
    var c: Any? = 1
    var i = c as Int
    println(i)

    var c1 = "test"
    var i1 = c1 as? Int     //no class cast error, return null
    println(i1)

    // Smart Casting

    val date: ChronoLocalDate? = LocalDate.now()    // nullable val declaration

    if (date != null) {
        println(date.isLeapYear)                    // check non null
    }

    if (date != null && date.isLeapYear) {          // check non-null and isLeap
        println("It's a leap year!")
    }

    if (date == null || !date.isLeapYear) {         // check null or not leap year
        println("There's no Feb 29 this year...")
    }

    if (date is LocalDate) {        //Smart-cast to the subtype LocalDate
        val month = date.monthValue                 // 5
        println(month)
    }
}