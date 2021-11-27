package com.muru.kotlin.demo.annotation

import jakarta.inject.Inject

annotation class Ann1
class Example(@field:Ann1 val foo: Int,    // annotate Java field
              @get:Ann1 val bar: String,      // annotate Java getter
              @param:Ann1 val quux: Int) // annotate Java constructor parameter

// The same syntax can be used to annotate the entire file
// @file:JvmName("Foo")
// package org.jetbrains.demo
annotation class VisibleForTesting
class Collaborator
class Example2 {
    @set:[Inject VisibleForTesting]
    var collaborator: Collaborator = Collaborator()


}