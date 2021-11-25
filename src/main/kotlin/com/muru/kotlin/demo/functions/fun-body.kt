package com.muru.kotlin.demo.functions

// Functions with block body must always specify return types explicitly
/*
fun square(i: Int) {    // Error
    return i*i
}*/

fun squareInt(i: Int): Int {    // OK
    return i*i                  // return statement also needed.
}