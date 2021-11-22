package com.muru.kotlin.demo.classes

class Host(val hostname: String) {
    fun printHostname() { print(hostname) }
}

class Connection(val host: Host, val port: Int) {
    fun printPort() { print(port) }

    fun Host.printConnectionString() {
        printHostname()     // calls Host.printHostname()
        print(":")
        toString()          // calls Host.toString()
        printPort()         // calls Connection.printPort()
        this@Connection.toString()  // calls Connection.toString()
    }

    fun connect() {
        /*...*/
        host.printConnectionString()   // calls the extension function
    }
}

fun main() {
    Connection(Host("kotl.in"), 443).connect()
    //Host("kotl.in").printConnectionString()   // error, the extension function is unavailable
                                                // outside Connection
}