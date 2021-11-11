package com.muru.kotlin.demo.basics
//valuables can not reassign to different values
fun main() {
    val name = "Ram"        //immutable
    println(name)
    //name = "Ganesh"       //this gives error

    println(name.isEmpty())

    val age = 32        //infers Int type
    println(age);

    //age = 32  //error

    val nameLazy: String by lazy {  //useful for time consuming init
        println("initializing") //initialized only once after val is referred
        "LazyBoy"
    }
    println("After lazy val declare some operation")
    println(nameLazy)
    println(nameLazy)

    println("------------")
    val lazyVal = lazy { "some lazy val" }
    println(lazyVal.isInitialized())
    println(lazyVal.value)
    println(lazyVal.isInitialized())
}