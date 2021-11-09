package com.muru.kotlin.demo.basics

fun main() {
    var cl = MyCl();
    //println(cl.geName())    //Error: late init property name has not been initialized
    //println(cl.name)          //Same error

    cl.name = "Rams"
    println(cl.geName())

}
// late init variables has to be initialized before it is use.
//else we get error when we invoke it.
class MyCl {
    lateinit var name: String
    fun geName(): String {
        return name;
    }
}
