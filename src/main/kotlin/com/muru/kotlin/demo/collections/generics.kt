package com.muru.kotlin.demo.collections

import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import kotlin.reflect.typeOf

fun main() {
    var i = listOf(1,2,3)
    var s = listOf("1s","2s","3s")
    PrintSpecial(i).print()
    PrintSpecial(s).print()
    var p = listOf<PersonIt>(PersonIt("p1"), PersonIt("p2"))
    PrintSpecial(p).print()

}

class PrintSpecial<T>(private val list: List<T>) {
    fun print() {
        list.forEach {println("${it!!::class.qualifiedName} $it ")}
    }
}

data class PersonIt(val name: String)
