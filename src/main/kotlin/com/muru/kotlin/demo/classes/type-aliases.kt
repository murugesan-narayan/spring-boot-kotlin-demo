package com.muru.kotlin.demo.classes
typealias AuthToken = String

fun main() {
    var u = UserData("u12", "38fk9283rn2kio=")
}

data class UserData(var id: String, var authToken: AuthToken)