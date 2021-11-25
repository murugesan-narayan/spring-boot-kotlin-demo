package com.muru.kotlin.demo.objects

class C {
    private fun getObject() = object {
        val x: String = "x"
    }

    fun printX() {      // all its members are accessible via this function or property
        println(getObject().x)
    }
}

fun main() {
    C().printX()
    //CR().getObject().x    // Error: fun returns Any, not Object.
    CR().getObjectAR().funFromAR() // Returns AR, so it is ok.
    //CR().getObjectBR().funFromAR() //Error: returns BR, so other methods not callable

}

interface AR {
    fun funFromAR() {
        println("From funFromAR")
    }
}
interface BR

class CR {
    // The return type is Any. x is not accessible
    fun getObject() = object {
        val x: String = "x"
    }

    // The return type is A; x is not accessible
    fun getObjectAR() = object: AR {
        override fun funFromAR() {}
        val x: String = "x"
    }

    // The return type is B; funFromA() and x are not accessible
    fun getObjectBR(): BR = object: AR, BR { // explicit return type is required
        override fun funFromAR() {}
        val x: String = "x"
    }
}