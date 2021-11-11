package com.muru.kotlin.demo.classes

fun main() {
    println(AccType.PLATINUM)
    println(AccType.PLATINUM.discountPercent)
    //println(AccType.valueOf("gold")) //error
    println(AccType.valueOf("GOLD")) //ok
    println(AccType2.PLATINUM.calcDiscount())
    println(AccType2.getAccTypeByName("silver"))    //ok because gets through static method

    println("--------------------------")
    val state = State.RUNNING                         // 2
    val message = when (state) {                      // 3
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
        else -> "" // Else is optional, if compiler can detect all the enum values are covered
    }
    println(message)

    println("--------------------------")
    val red = Color.RED
    println(red)                                      // 4
    println(red.containsRed())                        // member functions called on references
    println(Color.BLUE.containsRed())                 // member functions called on instances
    println(Color.YELLOW.containsRed())               // 7
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

enum class State {
    IDLE, RUNNING, FINISHED                           // 1
}

enum class Color(val rgb: Int) {                      // 1
    RED(0xFF0000),                                    // 2
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  // 3
}
