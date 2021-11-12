package com.muru.kotlin.demo.functions

data class Item(val name: String, val price: Float)                                         // 1

data class Order(val items: Collection<Item>)

//Adds extension functions for Order Type
fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // 2
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

//Adds extension property for Order Type
val Order.commaDelimitedItemNames: String                                                   // 3
    get() = items.joinToString { it.name }

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

}