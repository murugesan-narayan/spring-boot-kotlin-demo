package com.muru.kotlin.demo.functions.scope

import java.nio.file.Files
import java.nio.file.Paths

fun main() {
    val path = Paths.get("src/main/kotlin/com/muru/kotlin/demo/functions/file.txt")
    val stream = Files.newInputStream(path)
    // here use method is like Java's try-with-resources
    stream.buffered().reader().use { reader ->
        println(reader.readText())
    }
}