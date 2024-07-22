package org.example.Lesson_2

fun main() {

    println() //1

    val message: () -> Unit
    message = ::help
    message()

    println() //2

    // operation указывает на функцию sums
    var operation: (Int, Int) -> Int = ::sums
    val result1 = operation(10, 5)
    println(result1) // 15

    // operation указывает на функцию subtract
    operation = ::subtract
    val result2 = operation(10, 5)
    println(result2) // 5

}

fun help() {
    println("Hello Kotlin")
}

fun sums(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}