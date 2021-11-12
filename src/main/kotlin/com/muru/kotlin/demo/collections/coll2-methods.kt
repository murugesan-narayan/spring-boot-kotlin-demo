package com.muru.kotlin.demo.collections

fun main() {

    println("-------------")
    val people = listOf(                                                     // 2
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))

    //returns map from phone numbers to their owners' information
    val phoneBook = people.associateBy { it.phone }
                                    // lambda gives key selector, value by default its whole value
    println("$phoneBook")

    // returns map from phone numbers to the cities where owners live
    val cityBook = people.associateBy(Person::phone, Person::city) //two lambdas - key, value selector
    println("$cityBook")

    //groups map value objects by its city name and value as list of names
    val peopleCities = people.groupBy(Person::city, Person::name)    // key, value selector
    println("$peopleCities")

    //returns map from key as city to value as name,
    // in case city is same for many, last person is assigned.
    val lastPersonCity = people.associateBy(Person::city, Person::name)      // 6
    println("$lastPersonCity")

    println("-------------")

}

data class Person(val name: String, val city: String, val phone: String) // 1

