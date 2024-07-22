package org.example.Lesson_1

fun main() {

    // Создание массива целых чисел длиной 10
    val squares = IntArray(10) { it * it }

// Вывод элементов массива
    for (num in squares) {
        println(num)
    }

    println("----------")

    // Функция для вычисления суммы элементов массива
    fun sumArray(array: IntArray): Int {
        return array.sum()
    }

// Пример использования функции
    val array = intArrayOf(1, 2, 3, 4, 5)
    val result = sumArray(array)
    println(result) // Должно вывести 15

    println("----------")

    // Создание массива строк с именами городов
    val cities = arrayOf("Moscow", "London", "Paris", "New York", "Tokyo")

// Сортировка массива в алфавитном порядке
    val sortedCities = cities.sortedArray()

// Вывод отсортированного массива
    for (city in sortedCities) {
        println(city)
    }

}