package com.muru.kotlin.demo.functions

data class Item(val name: String, val price: Float)                                         // 1

data class Order(val items: Collection<Item>)

// Adds extension functions for Order Type
// 'this' keyword inside an extension function corresponds to the receiver object
fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // 2
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

//Adds extension property for Order Type
val Order.commaDelimitedItemNames: String                                                   // 3
    get() = items.joinToString { it.name }

/**
 * Extensions do not actually modify the classes they extend.
 * By defining an extension, you are not inserting new members into a class
 * only making new functions callable with the dot-notation
 */
fun main() {

    val order = Order(listOf(Item("Bread", 25.0F),
        Item("Wine", 29.0F),
        Item("Water", 12.0F)))

    // calls extension function directly on instance
    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")

    // calls extension property directly on instance
    println("Items: ${order.commaDelimitedItemNames}")                                      // 5

    //It is even possible to execute extensions on null references
    fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"
    var testNull: Item? = null
    println(testNull.nullSafeToString())

    // If a class has a member function,
    // and an extension function is defined which has the same receiver type,
    // the same name, and is applicable to given arguments,
    // the member always wins.
    Example().printFunctionType()
}

class Example {
    fun printFunctionType() { println("Class method") }
}

fun Example.printFunctionType() { println("Extension function") }


fun Any?.toString(): String {
    if (this == null) return "null"
    // after the null check, 'this' is auto cast to a non-null type, so the toString() below
    // resolves to the member function of the Any class
    return toString()
}