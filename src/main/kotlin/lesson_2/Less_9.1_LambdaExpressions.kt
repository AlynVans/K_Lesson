package org.example.Lesson_2

fun main() {
    val words = listOf("Bruh", "Kotlin", "Compose", "Pizdes", "Sun")
    val sortedWords = words.sortedByDescending { it.length }
    println(sortedWords)
}