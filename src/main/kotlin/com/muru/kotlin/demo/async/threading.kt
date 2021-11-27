package com.muru.kotlin.demo.async

class Token
class Item
class Post

fun postItem(item: Item) {
    val token = preparePost()
    val post = submitPost(token, item)
    processPost(post)
}

fun processPost(post: Post) {
    //post it
}

fun submitPost(token: Token, item: Item): Post {
    return Post()
}

fun preparePost(): Token {
    // makes a request and consequently blocks the main thread
    return Token()
}

