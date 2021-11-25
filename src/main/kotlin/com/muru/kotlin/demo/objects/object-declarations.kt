package com.muru.kotlin.demo.objects

// Object declarations are initialized lazily, when accessed for the first time.
fun main() {
    //To refer to the object, use its name directly
    DataProviderManager.registerDataProvider("Test")
}
// Singleton class
// The initialization of an object declaration is thread-safe and done on first access.
// objects can have supertypes
object DataProviderManager {
    fun registerDataProvider(provider: String) {
        // ...
    }

    val allDataProviders: Collection<String>
        get() = listOf("Test")
}
