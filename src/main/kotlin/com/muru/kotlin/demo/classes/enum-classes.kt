package com.muru.kotlin.demo.classes

fun main() {
    println(AccType.PLATINUM)
    println(AccType.PLATINUM.discountPercent)
    //println(AccType.valueOf("gold")) //error
    println(AccType.valueOf("GOLD")) //ok
    println(AccType2.PLATINUM.calcDiscount())
    println(AccType2.getAccTypeByName("silver"))    //ok because gets through static method
}

enum class AccType(val discountPercent: Int) {
    BRONZE(2), SILVER(3), GOLD(5), PLATINUM(7)
}

enum class AccType2() {
    BRONZE{
        override fun calcDiscount(): Int {
            //some func
            return 2;
        }
    },
    SILVER {override fun calcDiscount() =  3},
    GOLD {override fun calcDiscount() =  5},
    PLATINUM {override fun calcDiscount() = 7};

    abstract fun calcDiscount(): Int

    companion object {
        fun getAccTypeByName(name: String) = valueOf(name?.uppercase())
    }
}
