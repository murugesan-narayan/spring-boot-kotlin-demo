package com.muru.kotlin.demo.classes

import jakarta.inject.Inject

fun main() {

}

/** Const:
 * It must be a top-level property, or a member of an object declaration or a companion object.
 * It must be initialized with a value of type String or a primitive type
 * It cannot be a custom getter, can be used in annotations
 */
const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"

fun copyAddress(address: Address): Address {
    val result = Address() // there's no 'new' keyword in Kotlin
    result.name = address.name // accessors are called
    result.street = address.street
    // ...
    return result
}

//  var <propertyName>[: <PropertyType>] [= <property_initializer>]
//      [<getter>]
//      [<setter>]
class Address {
    var initialized = 1 // has type Int, default getter and setter
    // var allByDefault // ERROR: explicit initializer required, default getter and setter implied
    //val simple: Int? = null  // has type Int, default getter, must be initialized in constructor
    val inferredType = 1 // has type Int and a default getter

    var setterVisibility: String = "abc"
        private set // the setter is private and has the default implementation

    var setterWithAnnotation: Any? = null
        @Inject set // annotate the setter with Inject

    var counter = 0 // the initializer assigns the backing field directly
        set(value) {
            if (value >= 0)
                field = value
            // counter = value // ERROR StackOverflow: Using actual name 'counter' would make setter recursive
        }

    private var size: Int = 0
    val isEmpty: Boolean
        get() = this.size == 0

    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"


    @Deprecated(SUBSYSTEM_DEPRECATED) fun foo() {  }

    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap() // Type parameters are inferred
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }
}

class RectangleR(val width: Int, val height: Int) {
    val square: Int
        get() = this.width * this.height        // called every time you access the property

    //in simple terms
    val squareSimple get() = this.width * this.height

    var stringRepresentation: String
        get() = this.toString()
        set(value) {                // called every time you set the property
            setDataFromString(value) // parses the string and assigns values to other properties
        }

    private fun setDataFromString(value: String) {
        TODO("Not yet implemented")
    }
}

class MyTest {
    lateinit var subject: IntArray

    fun setup() {
        subject = intArrayOf(3,1,2)
    }

    fun test() {
        var v = if (this::subject.isInitialized)    //check if initialized
            subject.toString()  // now accessible
        else throw UninitializedPropertyAccessException("subject must be initialized.")
    }
}
