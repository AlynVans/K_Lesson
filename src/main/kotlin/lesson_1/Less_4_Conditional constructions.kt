package lesson_1

fun main() {

    println("\n\tif/else\n")

    val a1 = 10
    if (a1 == 10) {
        println("a равно 10")
    } else if (a1 == 9) {
        println("a = 9")
    } else {
        println("a = неопределенное значение")
    }

    println("----------")
    println("----------")

    println("\n\tif/else короткая версия\n")

    val a2 = 10
    val b2 = 20
    val c2 = if (a2 > b2) a2 else b2

    println("c2 = $c2")

    println("----------")

    println("\n\twhen\n")

    val isEnabled = true
    when (isEnabled) {
        false -> println("isEnabled off")
        true -> println("isEnabled on")
    }

    println("----------")

    val a3 = 30
    when (a3) {
        10 -> println("a = 10")
        20, 30 -> println("a = 20 или 30")
        else -> println("Неопределенное значение")
    }

    println("----------")

    println("\n\twhen с приколом\n")

    var a4 = 10
    when (a4) {
        10 -> {
            println("a = 10")
            a4 *= 2
        }

        20, 30 -> {
            println("a = 20 или 30")
            a4 *= 5
        }

        else -> {
            println("неопределенное значение")
        }
    }
    println("a4 = $a4")

    println("----------")

    println("\n\tещё один прикол с when\n")

    val a5 = 12
    when (a5) {
        in 10..19 -> println("a в диапазоне от 10 до 19")
        in 20..29 -> println("a в диапазоне от 20 до 29")
        !in 30..39 -> println("a вне диапазона от 30 до 39") //не выведется ибо выполнился первый when
        else -> println("неопределенное значение")
    }

    println("----------")

    println("\n\twhen только с изменяемым выбором\n")

    val a6 = 10
    val b6 = 15
    when (val c6 = a6 + b6) {
        10 -> println("a + b = 10")
        20 -> println("a + b = 20")
        b6 + 5 -> println("Так тоже можно")

        else -> println("c6 = $c6")
    }

    println("\n\twhen как значение переменной\n")

    val a7 = 1000
    val b7 = when (a7) {
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }
    println("b7 = $b7")

}