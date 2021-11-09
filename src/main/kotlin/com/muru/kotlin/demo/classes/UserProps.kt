package com.muru.kotlin.demo.classes

//objects meant for singleton classes.
//so one instance will be created per class loader.
//but make sure, you keep the object internal state in a thread safe way.
object UserProps {
    val USER_DB = "mongo"
    val USER_TABLE = "tbl_user"
}