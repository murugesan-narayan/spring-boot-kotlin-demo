package com.muru.kotlin.demo.basics

fun main() {
    var name = "Test"
    //name = null;      //error we can not assign null for non-null string

    var optionalName: String? = "test"
    optionalName = null;        //this is ok.

    var age = 25
    //age = null        //error we can not assign null for non-null number

    var optionalAge: Int? = 25
    optionalAge = null          //this is ok.

    var p1 = Person("test")
    //p1 = null;        //error we can not assign null for non-null object

    var p2 :Person? = Person("test")
    p2 = null       //this is ok

    var len = name.length

    var name2: String? = null
    //var len2 = name2.length       //without safe guard, error
    var len2 = name2?.length        //returns null or length

    println(len2)                   // returns null
    len2 = name2?.length ?: 0
    println(len2)                   // returns 0

    var len3= name2?.substring(1,2)?.length;    //with chained safeguard

    var str5: String? = "tes"
    var len5 = str5!!.length        //here code asserts that, we will never get null
                                    //if it is null  then runtime error.
                                    // !! this called double bank operator

    //we can also wrap with requireNotNull to ensure non-null value passed
    // checkNotNull is also the same functionality
    var str6: String? = "6"
    var len6 = requireNotNull(str6) { "str6 can't be null" }.length      //if null we get Illegal Argument
    println(len6)

}

class Person(val name: String)
