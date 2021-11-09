package com.muru.kotlin.demo.inter

fun main() {
    var c = CustomerController(CustomerService())
    c.handle(Customer("Cheng"))
}

class CustomerController(var service: CustomerService) {
    fun handle(c: Customer) = service.process(c)
}