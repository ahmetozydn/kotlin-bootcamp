HIGHLIGHTS ON BOOTCAMP

Kotlin is maintained by Intellij team. It's similar to Swift

- Com means company
```kotlin
snake_case // generally used in DB
kebap-case
camelCase // variable names
PascalCase // Class Names
```
- in Swift corresponding value of $ is /0 .
- val, var, let, final
- Variables declared with val are read-only or immutable.
- >= => in kotlin, <= >= in javascript because -> and => signs are reserved words in both languages.
- lambda expressions???

_switch-case structure_
````kotlin
    when(expression){
        1 -> {} // switch-case-break-default
        2 -> {}
        else -> {}
    }

    switch(){ // in other languages
        case 0: {}
        break;
        case1: {}
        break;
        default: {}
        break;
    }
````
lambda expression in Kotlin in other word anonymous function
Lambda expressions are commonly used as arguments to `higher-order` functions, such as map, filter, and forEach:

`Latenit` property doesn't used with primitive types


````kotlin
    val lambdaName: (parameters) -> returnType = { /* function body */ }
    val greet = { println("Hello, Kotlin!") } // no params function
    val add = { x: Int, y: Int -> x + y }
    val numbers = listOf(1, 2, 3, 4, 5)
    val squared = numbers.map { it * it }
````


importing a class in TS -> import { Class } ./package/current </br>
importing a class in Kotlin -> import com.example.package.Class </br>
Preferring data types as String, Int, Double allows developers to use int, string, double as variable


````kotlin
    // Kotlin is enough smart to detect the method returns nothing
    fun returnsNothing(): Unit {  }
````
- object example in Kotlin, custom object that doesn't belong to any class.
````kotlin
    // 
    val helloWorld = object {
        val hello = "Hello"
        val world = "World"
        // object expressions extend Any, so `override` is required on `toString()`
        override fun toString() = "$hello $world"
}
````

creating a data class in kotlin and other languages;
java model class can be translated to data class in Kotlin using ``primary constructor``

````kotlin

import java.util.Date

    data class CustomData(val date: Date, int: Int)
    interface Icustom {
        val date: Date
        val int:Int
    }
    class DataClass{ // converted to primary constructor
        private val int:Int
        private val string:String
        constructor( int:Int, string:String){
            this.int = int
            this.string = string
        }
    }
````

Because there is no ``type`` keyword to create a custom type in kotlin to return two data type, </br>
it is necessary to create a data class that defines return types </br>
``JVM does not allow returning more than one value from a function, so all we can do is return a Pair/Triple`` </br>
In Kotlin, a function must have a single well-defined return type. You cannot directly return different types (e.g., Int or String) based on a condition within the same function. </br>
However, you can return a common supertype that both Int and String inherit from, such as Any. </br>
````kotlin
    data class DataClass(val int:Int, string:String)
    fun function(){
        val obj = DataClass()
        if(){ return DataClass }
    }
    // multiple return types can be used while using any but that doesn't guarantee safety
    fun returnIntAndString(condition: Boolean): Any? {
        return if (condition) {
            42
        } else {
            "Hello"
        }
    }
    // return multiple items can be done by using data class, array or pair
    fun yourFunction(): Pair<Int, String> {
        // Your logic here
        val intValue = 42
        val stringValue = "Hello, Kotlin!"
        return Pair(intValue, stringValue)
    }
````

In Kotlin, a ``type alias`` is a way to give a new name to an existing type. </br>
It can be useful to improve code readability, especially when dealing with complex or long type names. </br>
Type aliases are introduced using the ``typealias`` keyword.</br>
````kotlin
    typealias NewTypeName = ExistingType
````

### Inheritance
- super, base, parent class
- child, derived class
- By default, Kotlin classes are final – they can't be inherited. To make a class inheritable, mark it with the open keyword:
````kotlin
open class Animal { }
class Dog : Animal(name)
````
````kotlin
````
````kotlin
````
````kotlin
````
````kotlin
````

class Assignment2{
question1{
    son 2 soruda mutlak bir doğru yok, kendine göre çözmelisin
}

}


