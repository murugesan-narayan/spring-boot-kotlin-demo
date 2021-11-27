package com.muru.kotlin.demo.async

// Kotlin's approach to working with asynchronous code is using coroutines,
// which is the idea of suspendable computations,
// i.e. the idea that a function can suspend its execution at some point and resume later on.

fun postItem5(item: Item) {
    /*launch {
        val token = preparePost5()
        val post = submitPost(token, item)
        processPost(post)
    }*/
}

suspend fun preparePost5(): Token {
    // makes a request and suspends the coroutine
//    return suspendCoroutine { /* ... */ }
    return Token()
}
