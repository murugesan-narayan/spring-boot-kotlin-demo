package com.muru.kotlin.demo.annotation

// Java annotations are 100% compatible with Kotlin:
//import org.junit.Test
//import org.junit.Assert.*
//import org.junit.Rule
//import org.junit.rules.*


class Tests {
    // apply @Rule annotation to property getter
//    @get:Rule val tempFolder = TemporaryFolder()

//    @Test
    /*fun simple() {
        val f = tempFolder.newFile()
        assertEquals(42, getTheAnswer())
    }*/
}

// Kotlin
@AnnJ(intValue = 1, stringValue = "abc")    //java annotation
class C2


// To extract Kotlin or Java repeatable annotations via reflection,
// use the KAnnotatedElement.findAnnotations()
// Kotlin
fun foo(ann: AnnJ) {
    val i = ann.intValue    //accessing annotation property
}

// Kotlin
@AnnWithValue("abc")        //java annotation
class C1

// Kotlin
@AnnWithArrayValue("abc", "foo", "bar")
class CA

@AnnWithArrayMethod(names = ["abc", "foo", "bar"])
class CM
