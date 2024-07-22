package org.example.Lesson_2

//fun main() {
//    // Функция высшего порядка, которая принимает другую функцию в качестве параметра
//    fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
//        return operation(x, y)
//    }
//
//    // Примеры использования функции высшего порядка с различными операциями
//    val sum = calculate(5, 3) { a, b -> a + b }
//    val product = calculate(5, 3) { a, b -> a * b }
//
//    println("Sum: $sum")       // Выведет: Sum: 8
//    println("Product: $product") // Выведет: Product: 15
//}

fun main() {
    fun filterList(numbers: List<Int>, predicate: (Int) -> Boolean): List<Int> {
        return numbers.filter(predicate)
    }

    val numb1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val filteredList = filterList(numb1) { it % 3 == 0 }
    println(filteredList)
}