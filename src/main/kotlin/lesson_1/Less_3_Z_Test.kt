package lesson_1

fun main() {

    val a = 9
    if (a % 2 == 0) {
        println("Чётное число")
    } else {
        println("Нечётное число")
    }

    println(" ")

    val q = true
    val p = false

    if (p == !q) {
        println("True")
    } else {
        println("False")
    }

    println(" ")

    val a3 = 69

    if (a3 in 1..10) {
        println("Have")
    } else {
        println("None")
    }

}