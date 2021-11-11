package com.muru.kotlin.demo.classes

import kotlin.random.Random

fun main() {
    var userDb = UserProps.USER_DB
    var userTable = UserProps.USER_TABLE
    println(userDb)
    println(userTable)

    println("--------------------------------")
    val d1 = LuckDispatcher()             // Creates instance
    val d2 = LuckDispatcher()

    d1.getNumber()                        // Calls the method on instance
    d2.getNumber()

    println("--------------------------------")
    rentPrice(10, 2, 1)


    println("--------------------------------")
    //Calls the method. This is when the object is actually created.
    DoAuth.takeParams("foo", "qwerty")

    println("--------------------------------")
    BigBen.Bong.getBongs(12)    //with companion name
    println()
    BigBen.getTongs(12)         //without companion name
}

//declares companion inner class, similar to lazy init static block
class BigBen {                                  //1
    companion object Bong {                   // name is optional, only one companion allowed
        fun getBongs(nTimes: Int) {             //3
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
        fun getTongs(nTimes: Int) {             //3
            for (i in 1 .. nTimes) {
                print("TONG ")
            }
        }
    }
}



//object declaration - singleton class
object DoAuth {                                                 //1
    fun takeParams(username: String, password: String) {        //2
        println("input Auth parameters = $username:$password")
    }
}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  //1

    val dayRates = object {      // object expression , similar to anonymous class instance
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special       //3

    print("Total price: $$total")                                               //4

}

class LuckDispatcher {                    //1
    fun getNumber() {                     //2
//        var objRandom = Random
        println(Random.nextInt(90))
    }
}
