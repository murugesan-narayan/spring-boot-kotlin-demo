package com.muru.kotlin.demo.collections

val openIssues: MutableSet<String> =
    mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // mutable set

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)         // adds to set
}

fun getStatusLog(isAdded: Boolean): String {    // status log
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."          // 3
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
                                // adds and prints status
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                // 5
}
