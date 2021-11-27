package com.muru.kotlin.demo.functions.lambdas

fun main() {
    var map = mapOf(1 to "One")
    map.mapValues { entry -> "${entry.value}!" }
    map.mapValues { (key, value) -> "$value!" }
    map.mapValues { (_, value) -> "$value!" }   //underscore for unused

    // You can specify the type for the whole de-structured parameter
    // or for a specific component separately:
    map.mapValues { (_, value): Map.Entry<Int, String> -> "$value!" }
    map.mapValues { (_, value: String) -> "$value!" }

    /*
    { a -> ... } // one parameter
    { a, b -> ... } // two parameters
    { (a, b) -> ... } // a de-structured pair
    { (a, b), c -> ... } // a de-structured pair and another parameter
    */
}
