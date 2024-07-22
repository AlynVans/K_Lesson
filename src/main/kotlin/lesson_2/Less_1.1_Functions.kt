package lesson_2

import java.util.*

val scan = Scanner(System.`in`)

fun main() {

    println("\n\tFun - hello\n")

    hello()     // 1 вызов функции hello

    println("\n\tFun - Show Message\n")

    showMessage("Hello Kotlin")     // 2 Принимает стринг значение и принтит
    showMessage("Привет Kotlin")

    println("\n\tFun - Display User\n")

    displayUser("Tom", age = 21, position = "Manager")  // 3 Принимает несколько значений и принтит их
    displayUser("Alice", age = 28)
    displayUser(name = "Kate")

}

fun hello() {    // 1
    println("Hello")
}


fun showMessage(message: String) {   // 2
    println(message)
}


fun displayUser(name: String, age: Int = 18, position: String = "unemployed") {    // 3
    println("Name: $name   Age: $age  Position: $position")
}