package lesson_1

//fun main() {
//    print("Введите число: ")
//    val number = scan.nextInt()
//
//    var factorial = 1
//    var n = number
//    while (n > 0) {
//        factorial *= n
//        n--
//    }
//
//    println("Факториал числа $number равен $factorial")
//}
//
//fun main() {
//    val arrayNumber = arrayOf(1, 2, 3, 4, 5)
//    plusArray(arrayNumber)
//
//}
//
//fun plusArray(numb: Array<Int>) {
//    var sum = 0
//    for (i in numb) {
//        sum += i
//    }
//    println(sum)
//}
//
//fun main() {
//    println("Enter number")
//    val number = readLine()?.toIntOrNull()
//    when {
//        number == null -> println("Вы ввели не число")
//        number in 1..9 -> println("Меленькое число")
//        number in 10..99 -> println("Среднее число")
//        number > 100 -> println("Большое число")
//    }
//}

fun main() {
    val words = listOf("Bruh", "Kotlin", "Compose", "Pizdes", "Sun")
    val sortedWords = words.sortedByDescending { it.length }
    println(sortedWords)
}