package com.muru.kotlin.demo.inter;

public class CustomerService {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        service.process(new Customer("Nick"));  //using kotlin class
    }

    public void process(Customer customer) {        //processing kotlin class
        System.out.println(customer.title());
        System.out.println(customer.getName());
        System.out.println(StringCustomUtils.firstChar(customer.getName()));
    }
}
