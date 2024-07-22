package lesson_1

import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    // Entry point for the application
}

fun calculateFactorial() {
    // Function to calculate the factorial of a given number
    print("Enter a number: ")
    val input = scanner.nextLine()
    val number = input.toIntOrNull()

    if (number != null) {
        var factorial = 1
        var n = number
        while (n > 0) {
            factorial *= n
            n--
        }
        println("The factorial of $number is $factorial")
    } else {
        println("Invalid input, not a number")
    }
}

fun sumOfArray() {
    // Function to sum the elements of an array
    val numberArray = arrayOf(1, 2, 3, 4, 5)
    calculateSum(numberArray)
}

fun calculateSum(numbers: Array<Int>) {
    // Helper function to calculate the sum of an array
    var totalSum = 0
    for (number in numbers) {
        totalSum += number
    }
    println("The sum of the array is $totalSum")
}

fun classifyNumber() {
    // Function to classify a number as small, medium, or large
    print("Enter a number: ")
    val number = scanner.nextLine().toIntOrNull()
    when {
        number == null -> println("Invalid input, not a number")
        number in 1..9 -> println("Small number")
        number in 10..99 -> println("Medium number")
        number > 100 -> println("Large number")
    }
}

fun sortWordsByLength() {
    // Function to sort and print words by their length in descending order
    val words = listOf("Bruh", "Kotlin", "Compose", "Pizdes", "Sun")
    val sortedWords = words.sortedByDescending { it.length }
    println(sortedWords)
}
