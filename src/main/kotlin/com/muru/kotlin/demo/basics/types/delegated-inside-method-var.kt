package com.muru.kotlin.demo.basics.types

class Foo {
    fun isValid() = true
    fun doSomething() = println("....")
}

fun example(computeFoo: () -> Foo, num: Int) {
    val memoizedFoo by lazy(computeFoo)

    // memoizedFoo will get initialized only if it gets num>5
    if (num > 5 && memoizedFoo.isValid()) {
        memoizedFoo.doSomething()
    }
}
