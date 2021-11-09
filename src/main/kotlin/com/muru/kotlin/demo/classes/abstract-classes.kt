package com.muru.kotlin.demo.classes

fun main() {
    var myEmp = Emp(1, "Rock")
    myEmp.printEmpInfo()
    println(myEmp.department())
    println(myEmp.isManager())
}

//we can NOT create instance of abstract class
abstract class AbstractEmp(var id: Int, var name: String) {
    abstract fun department(): String
    abstract fun isManager(): Boolean
    fun printEmpInfo() = println("Id: $id - Name: $name")
}

class Emp(id: Int,name: String): AbstractEmp(id, name) {
    override fun department(): String {
        return "IT"
    }

    override fun isManager(): Boolean {
        return false
    }

}
