package com.muru.kotlin.demo.basics

fun main() {
    var greet: (String) -> String = { message -> "Hello $message" }

    println(greet("Obama"))

    var greetCouple: (String, String) -> String = { hus, wife -> "Hello Mr.$hus and Ms.$wife" }
    println(greetCouple("Obama", "Michale"))

    printUnit {
        println("line1")
        println("line2")
        println("line23")
    }

    printWinner { listOf("Per1","Per2","Per3").random() }

//    greetAll(listOf("Robin", "Roger", "Verner")) { "Hello" }      //error, args are mandatory
    greetAll(listOf("Robin", "Roger", "Verner")) { _, _ -> "Hello" }
    greetAll(listOf("Robin", "Roger", "Verner")) { title, _ -> "Hello $title." }
    greetAll(listOf("Robin", "Roger", "Verner")) { title, name -> "Hello $title. $name"}

    goodByeAll(listOf("Robin", "Roger", "Verner")) { _ -> "GoodBye" }
    goodByeAll(listOf("Robin", "Roger", "Verner")) { name -> "GoodBye $name" }
    goodByeAll(listOf("Robin", "Roger", "Verner")) { "GoodBye $it" } // one arg value assigned to it
    goodByeAll(listOf("Robin", "Roger", "Verner")) { "GoodBye" }    //for one arg, we can skip it
}

fun printUnit(block: () -> Unit) {
    println("--------------------------")
    block()
    println("--------------------------")
}

fun printWinner(block: () -> String) {
    var winner = block()
    println("The Winner is $winner")
}

fun greetAll(list: List<String>, block: (title: String, name: String) -> String) {
    list.forEach { name ->
        var greet = block("Mr", name)
        println(greet)
    }
}

fun goodByeAll(list: List<String>, block: (name: String) -> String) {
    list.forEach { name ->
        var greet = block(name)
        println(greet)
    }
}
