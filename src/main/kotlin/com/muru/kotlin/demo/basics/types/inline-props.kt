package com.muru.kotlin.demo.basics.types

class Bar
class InlineProp {
    // The inline modifier can be used on accessors of properties that don't have backing fields
    val foo: Foo
        inline get() = Foo()

    var bar: Bar
        get() = bar
        inline set(v) { v }

    // You can also annotate an entire property, which marks both of its accessors as inline:
    inline var barIn: Bar
        get() = Bar()
        set(v) { v }
}