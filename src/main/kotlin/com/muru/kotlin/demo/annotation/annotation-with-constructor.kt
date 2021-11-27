package com.muru.kotlin.demo.annotation

import kotlin.reflect.KClass

//Annotations can have constructors that take parameters.
annotation class Special(val why: String)

@Special("example")
class Foo {}

annotation class ReplaceWith(val expression: String)

annotation class Deprecated(
    val message: String,
    val replaceWith: ReplaceWith = ReplaceWith(""))

@Deprecated("This function is deprecated, use === instead", ReplaceWith("this === other"))
class D

// If you need to specify a class as an argument of an annotation, use a Kotlin class
// he Kotlin compiler will automatically convert it to a Java class,
// so that the Java code can access the annotations and arguments normally.
annotation class Ann(val arg1: KClass<*>, val arg2: KClass<out Any>)

@Ann(String::class, Int::class)
class MyClass
