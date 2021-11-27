package com.muru.kotlin.demo.async

// With callbacks, the idea is to pass one function as a parameter to another function,
fun postItem1(item: Item) {
    preparePostAsync { token ->
        //submitPostAsync(token, item) { post ->
          //  processPost(post)
        //}
    }
}

fun submitPostAsync(token: Token, item: Item, any: Any) {
    TODO("Not yet implemented")
}


fun preparePostAsync(callback: (Token) -> Unit) {
    // make request and return immediately

    // arrange callback to be invoked later

}