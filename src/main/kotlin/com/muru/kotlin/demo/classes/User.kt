package com.muru.kotlin.demo.classes

class User constructor(var firstName: String, var lastName: String, var isLoggedIn: Boolean) {
    constructor(firstName: String, lastName: String): this(firstName, lastName, false) {
        println("inside two args constructor")
    }
    constructor(): this("<<FirstName>>", "<<LastName>>") {
        println("inside three args constructor")
    }

    var nameWithTitle: String = "Mr/Mrs ${fullName()}"
        get() = "Name: $field"
        set(value) {
            field = if (value.startsWith("Mr/Mrs "))
                value
            else "Mr/Mrs $value"
        }

    val typeVersion: String = "1.2"
        get() = "User Type Version: $field"

    //this is called after the primary constructor called, but before other constructor code runs.
    //you can have multiple init, but runs in the declaration order.
    init {
        println("-------Inside Init Block--------$nameWithTitle----")
        //if you are referring any instance variable inside init, declare it before
    }
    private constructor(firstName: String): this(firstName, "<<LastName>>")
    fun fullName() : String = "$firstName $lastName"
    fun updateFirstName(name: String) {
        firstName = name
    }

    //inside here you declare all your class scoped variables.
    companion object {
        fun createUser(firstName: String, lastName: String): User {
            return User(firstName, lastName)
        }
    }
}