package com.example.kotlinbootcamp.fundamentals

fun main() {
    // Define a lambda expression that takes two integers and returns their sum
    val add: (Int, Int) -> Int = { x, y -> x + y }

    // Use the lambda expression
    val result : Int = add(3, 5).also { // another name is anonymous function
        println(it) // Output: 8
    }

}