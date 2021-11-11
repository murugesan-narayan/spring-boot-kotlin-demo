package com.muru.kotlin.demo.classes

fun main() {
    var p = Person("Rand", "Sandy")
    println(p.component1())
    println(p.component2())

    val (firstName, lastName) = p       //de-structuring
    println("$firstName $lastName")
    val pc = p.copy()
    println(pc)
    println(p.copy(firstName = "Sam"))
    println(p.firstName)

    var p1 = PersonOne("Ren", "Martin")
    //val (firstName1, lastName1) = p1      // normal classes do not have de-structuring option

    val pair = Pair("age", 16)              // in-built data class for two args
    println(pair.first)
    println(pair.second)

    val pair2 = "age" to 16                 // creates in-fix pair
    println(pair.first)
    println(pair.second)

    val triple = Triple("Ran", 25, false);
    println(triple.first)
    println(triple.second)
    println(triple.third)

    println("--------------")
    val user = MyUser("Alex", 1)
    println(user)                        // toString implemented by default

    val secondUser = MyUser("Alex", 1)
    val thirdUser = MyUser("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // true - calls overridden equals method
    println("user == thirdUser: ${user == thirdUser}")     // false

    // hashCode() function
    println(user.hashCode())            // calls default implemented hashCode method
    println(secondUser.hashCode())      //
    println(thirdUser.hashCode())

    // copy() function - creates a new instance, so the object and its copy have distinct references
    println(user.copy())
    println(user === user.copy())  // False

    //you can change values of certain properties.
    // copy accepts arguments in the same order as the class constructor
    println(user.copy("Max"))
    println(user.copy(id = 3))    // with named arguments to change the value

    // Auto-generated componentN functions let you get the values of properties
    // in the order of declaration.
    println("name = ${user.component1()}")
    println("id = ${user.component2()}")

}

//data classes automatically provided with methods for copying, getting a string representation,
// and using instances in collections. You can override these methods with your own
// implementations in the class declaration.
data class Person(var firstName: String, var lastName: String)

class PersonOne(var firstName: String, var lastName: String)

data class MyUser(val name: String, val id: Int) {           // 1
    override fun equals(other: Any?) =
        other is MyUser && other.id == this.id               // 2
}
