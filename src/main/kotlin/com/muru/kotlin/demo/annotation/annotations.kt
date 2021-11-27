package com.muru.kotlin.demo.annotation

import jakarta.inject.Inject

// Annotations are means of attaching metadata to code

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
    AnnotationTarget.TYPE_PARAMETER, AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Fancy

@Fancy
class FooC {
    @Fancy
    fun baz(@Fancy foo: Int): Int {
        return (@Fancy 1)
    }
}

class MyDependency
//annotate the primary constructor
class FooD @Inject constructor(dependency: MyDependency) {  }

class FooE {
    var x: MyDependency? = null
        @Inject set     // annotate property accessors
}


annotation class Suspendable
// Annotations can also be used on lambdas
val f = @Suspendable { Thread.sleep(10) }

