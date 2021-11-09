package com.muru.kotlin.demo.inter

data class Customer(var name: String) {
    fun title() = "Mr"
    fun initial() = name[0]
}