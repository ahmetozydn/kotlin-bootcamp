package com.example.kotlinbootcamp

class Highlights {

    // LECTURE 1

    fun main() {

        val country : String = "Istanbul"
        println("Country : $country") // in JS ${}

        val temp = "34m"
        val result = temp.toIntOrNull() // instead of using toInt()

        if(result != null){ // the modern approach is using let
            println(result)
        }else{
            println("the variable is null")
        }
        result?.let {
            println(it);
        }
        // step is infix function
        for(a in 10 .. 20 step 5){ // downTo for decrease the number
            println("hi")
        }

    }

}