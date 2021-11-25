package com.muru.kotlin.demo.basics.types

var topLevelInt: Int = 0
class ClassWithDelegate(val anotherClassInt: Int)

class MyClassP(var memberInt: Int, val anotherClassInstance: ClassWithDelegate) {
    var delegatedToMember: Int by this::memberInt   // delegated to local prop
    var delegatedToTopLevel: Int by ::topLevelInt   // delegated to top level prop

    val delegatedToAnotherClass: Int by anotherClassInstance::anotherClassInt
}
var MyClassP.extDelegated: Int by ::topLevelInt

fun main() {
    var p = MyClassP(5, ClassWithDelegate(2))
    println(p.delegatedToMember)
    p.memberInt = 7;
    println(p.delegatedToMember)
    p.delegatedToMember = 8
    println(p.memberInt)        //both get and set delegated, affects both variable

    println("----------------")
    println(p.delegatedToTopLevel)
    topLevelInt = 1
    println(p.delegatedToTopLevel)

    println("----------------")
    println(p.delegatedToAnotherClass)
    println(p.extDelegated)     //prints latest val from delegator

    println("----------------")
    val dep = MyClassDep()
    println(dep.oldName)
    println(dep.newName)
    dep.newName = 2
    println(dep.oldName)

}

class MyClassDep {
    var newName: Int = 0
    @Deprecated("Use 'newName' instead", ReplaceWith("newName"))
    var oldName: Int by this::newName
}