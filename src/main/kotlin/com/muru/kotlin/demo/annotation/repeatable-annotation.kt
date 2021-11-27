package com.muru.kotlin.demo.annotation

//@JvmRepeatable(Tags::class)
annotation class Tag(val name: String)

annotation class Tags(val value: Array<Tag>)

// The compiler generates the @Tag.Container containing annotation

