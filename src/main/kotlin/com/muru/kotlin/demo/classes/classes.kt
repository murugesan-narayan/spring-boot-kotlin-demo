package com.muru.kotlin.demo.classes

fun main() {
    var user = User("Jack","Den", true)
    println(user.firstName)
    println(user.lastName)
    println(user.fullName())

    user.updateFirstName("Frank")
    println(user.fullName())

    var dirk = User(firstName = "Dirk", lastName = "Nannies")   //we can use named parameter
    println(dirk.isLoggedIn)

    var temp = User()
    println(temp.fullName())

    //var temp1 = User("Ran")       //error private constructor
    //println(temp1.fullName())

    var temp3 = User("Rachel", "Robin")
    println(temp3.nameWithTitle)

    temp3.nameWithTitle = "Rock Feller"
    println(temp3.nameWithTitle)

    //temp3.typeVersion = "2.3"     //read only property can not be assigned
    println(temp3.typeVersion)

    //companion  object
    var temp5 = User.createUser("Daniel", "Victor")
    println(temp5.nameWithTitle)
}

