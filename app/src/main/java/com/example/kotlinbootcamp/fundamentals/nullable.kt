package com.example.kotlinbootcamp.fundamentals

fun main() {
    //Null safety, Nullable
    var message : String? = "hivsdaf"
    print("${message?.uppercase()}")

    if(message != null){
        println(message.toString())
    }
    print(message!!.uppercase())

    fun here(x:Int,y:String){ } // return type doesn't supported for function overloading
    fun here(y:String, x:Int){ }// function overloading with different order parameters

}