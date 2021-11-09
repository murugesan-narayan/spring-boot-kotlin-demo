package com.muru.kotlin.demo.classes

fun main() {
    var inte = Internal()
    inte.info()
}

//internal class in visible within the module
internal class Internal {
    var internalName: String = "Internal Name"
    fun info() = internalName
}

class UseInternal {
    //fun getInternal() = Internal()   //Error we can not expose internal return type in public method
}
