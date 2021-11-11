package com.muru.kotlin.demo.functions

fun main() {
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "         //when we have additional args after varargs,use named param
    )
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}
fun printAll(vararg messages: String) {                            // 1
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
    for (m in messages) println(prefix + m)
}


fun log(vararg entries: String) {
    //printAll(entries)          //ERROR: You can not pass varargs as another varargs argument
    printAll(*entries)           //You need spread operator
}
