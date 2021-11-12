package com.muru.kotlin.demo.collections

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // we can add elements
val sudoers: List<Int> = systemUsers  // assigned to immutable[read only] view, we can NOT add

fun addSystemUser(newUser: Int) {                                 // adds new user
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                                  // returns immutable list
    return sudoers
}

fun main() {
    addSystemUser(4)   // 5
    println("Tot sudoers: ${getSysSudoers().size}")    // Retrieves the size of the read-only list
    getSysSudoers().forEach {                                     // prints all its elements
            i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!     // Error Attempting to write to the read-only view
}
