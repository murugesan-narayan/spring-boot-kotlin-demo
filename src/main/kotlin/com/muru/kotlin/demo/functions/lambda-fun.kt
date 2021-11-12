package com.muru.kotlin.demo.functions

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

    println("===============================================")

    val upperCase1: (String) -> String = { str: String -> str.uppercase() }
                                        // arg type is mentioned in lambda

    val upperCase2: (String) -> String = { str -> str.uppercase() }
                                        // arg type is inferred from declaration

    val upperCase3 = { str: String -> str.uppercase() }
                    // arg type is mentioned, but return type is the value returned.

    // val upperCase4 = { str -> str.uppercase() }
                        // ERROR: you can not skip type declaration both in variable and lambda params.

    val upperCase5: (String) -> String = { it.uppercase() }
                                        // lambdas with a single parameter,
                                        // you don't have to explicitly name it.
                                        // Instead, you can use the implicit "it" variable

    val upperCase6: (String) -> String = String::uppercase
                                        // If lambda consists of a single function call,
                                        // you may use function pointers (::) without curly braces

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))

    println("===============================================")

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
