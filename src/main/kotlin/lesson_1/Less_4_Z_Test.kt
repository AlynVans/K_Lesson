package lesson_1

fun main() {

    val a = 9
    if (a % 2 == 0) {
        println("Чётное число")
    } else {
        println("Нечётное число")
    }

    var b = scan.nextInt()
    when (b) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("F")
    }

    val c = scan.nextInt()
    val d = scan.nextInt()

    if (c > d) {
        println(c)
    } else if (c < d) {
        println(d)
    } else {
        println("Bruh")
    }

    fun findMaximum(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    findMaximum(1, 2)

    val e = readln()
    val f = readln()

    if (e == f) {
        println("Equals")
    } else {
        println("Bruh")
    }

    val w = scan.nextInt()
    when (w) {
        in 1..5 -> println("Рабочие дни")
        in 6..7 -> println("Выходные дни")
        else -> println("Bruh")
    }

}