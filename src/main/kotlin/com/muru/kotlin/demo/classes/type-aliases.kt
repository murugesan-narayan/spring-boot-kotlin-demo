package com.muru.kotlin.demo.classes

import java.io.File

// Type aliases provide alternative names for existing types.
// If the type name is too long you can introduce a different shorter name
// and use the new one instead
typealias AuthToken = String
typealias FileTable<K> = MutableMap<K, MutableList<File>>

// You can provide different aliases for function types:
typealias MyHandler = (Int, String, Any) -> Unit
typealias Predicate<T> = (T) -> Boolean

fun main() {
    var u = UserData("u12", "38fk9283rn2kio=")
    var ft : FileTable<String> = mutableMapOf()

    var mh: MyHandler = fun(age, name, data){
        println("$age $name $data")
    }
    mh(23, "Kent", mapOf("add" to "See Street 12, Hamburg-2323"))

    var isEven : Predicate<Int> = {num -> num%2 == 0}
    println(isEven(2))

    val greaterThanZero: Predicate<Int> = { it > 0 }
    println(greaterThanZero(2))
    println(listOf(1, -2).filter(greaterThanZero))
}

data class UserData(var id: String, var authToken: AuthToken)

class A1 {
    inner class Inner
}
class B1 {
    inner class Inner
}
// alias for inner and nested classes
typealias AInner = A1.Inner
typealias BInner = B1.Inner
