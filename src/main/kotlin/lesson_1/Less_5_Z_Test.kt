package lesson_1

fun main() {

    for (a in 1..100) {
        if (a % 3 == 0) {
            println("Fizz")
            continue
        }
        println(a)
    }

    val a = scan.nextInt()
    val b = scan.nextInt()

    for (i in a..b) {
        if (i % 5 == 0)
            println(i)
    }


    for (i in 1..8) { //Мой код
        println()
        for (j in 1..8) {
            if (j % 2 > 0) {
                print("#")
            } else {
                print(" ")
            }
        }
    }

    for (i in 1..8) { //код ИИ
        for (j in 1..8) {
            if ((i + j) % 2 == 0) {
                print("#")
            } else {
                print(" ")
            }
        }
        println()
    }
}