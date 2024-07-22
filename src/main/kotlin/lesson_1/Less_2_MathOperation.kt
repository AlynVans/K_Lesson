package lesson_1

fun main() {
    // Printing a header for the mathematical operations section
    println("\n\tОбычные математические операции\n")

    // Initializing variables for mathematical operations
    val x = 10
    val y = 3
    val divisor = 2.0  // Renamed from 'v' to 'divisor' for better clarity
    var result: Any  // Renamed from 'z' to 'result' for better clarity

    // Addition
    result = x + y
    println("x + y = $result")

    // Subtraction
    result = x - y
    println("x - y = $result")

    // Multiplication
    result = x * y
    println("x * y = $result")

    // Integer division
    result = x / y
    println("x / y = $result")

    // Division by a double value
    result = result / divisor
    println("result / divisor = $result")

    // Modulus operation
    result = x % y
    println("x % y = $result")

    // Printing a header for the increment/decrement section
    println("\n\tIncrement/Decrement\n")

    // Demonstrating pre-increment
    var a1 = 5
    println("a1 = $a1")
    val b1 = ++a1  // Pre-increment: a1 is incremented before assignment
    println("a1 = $a1")
    println("b1 = $b1")

    println("------")

    // Demonstrating post-increment
    var a2 = 5
    println("a2 = $a2")
    val b2 = a2++  // Post-increment: a2 is incremented after assignment
    println("a2 = $a2")
    println("b2 = $b2")

    println("------")

    // Demonstrating pre-decrement
    var a3 = 5
    println("a3 = $a3")
    val b3 = --a3  // Pre-decrement: a3 is decremented before assignment
    println("a3 = $a3")
    println("b3 = $b3")

    println("------")

    // Demonstrating post-decrement
    var a4 = 5
    println("a4 = $a4")
    val b4 = a4--  // Post-decrement: a4 is decremented after assignment
    println("a4 = $a4")
    println("b4 = $b4")

    println("------")
}