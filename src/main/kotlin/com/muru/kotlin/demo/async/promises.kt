package com.muru.kotlin.demo.async
class Promise<T>

// Idea is that when we make a call,
// we're promised that at some point it will return with an object called a Promise,
// which can then be operated on.
fun postItem2(item: Item) {
    preparePostAsync()
        /*.thenCompose { token ->
            submitPostAsync(token, item)
        }
        .thenAccept { post ->
            processPost(post)
        }*/
}

fun preparePostAsync(): Promise<Token> {
    // makes request and returns a promise that is completed later
    //return promise
    return null!!
}