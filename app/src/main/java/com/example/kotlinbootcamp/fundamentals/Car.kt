package com.example.kotlinbootcamp.fundamentals

class Car{
    private lateinit var list : ArrayList<String> // primitive types cannot be used together with lateinit keyword
    private  var surname : String // String is not a primitive types, reference type
    private  var age: Int;

    constructor( surname: String, age: Int){ // secondary constructor
        this.age= age
        this.surname =  surname
    }

    fun prn() = println(age).also {
        println(age)
    }
}
// primary constructor example
class Car2(private var name: String){ // without putting var keyword, variable cannot be reachable
    fun method() = run { name = "name" }
    init {
        // initialize constructor params here
        name = "name"
        // because Kotlin prefer to use of primary constructor, there cannot be make initialization inside the constructor. init is used for that reason
    }

    // extension function definition
    fun Int.add(x: Int) = this + x


    // Define a lambda expression that takes two integers and returns their sum
    val add: (Int, Int) -> Int = { x, y -> x + y }

    // Use the lambda expression
    val result : Int = add(3, 5).also {
        println(it) // Output: 8
    }

}