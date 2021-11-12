package com.muru.kotlin.demo.functions.scope

/**
 * "with" function can access members of its argument concisely:
 * you can omit the instance name when referring to its members
 */
fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    with(configuration) {
        println("$host:$port")      // refers to configuration's host and port
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")
}

class Configuration(var host: String, var port: Int)
