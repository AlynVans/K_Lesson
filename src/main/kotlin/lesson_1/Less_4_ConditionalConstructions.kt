package lesson_1

fun main() {
    println("\n\tif/else\n")

    val number1 = 10
    if (number1 == 10) {
        println("number1 is 10")
    } else if (number1 == 9) {
        println("number1 is 9")
    } else {
        println("number1 has an undefined value")
    }

    println("----------")

    println("\n\tShort version of if/else\n")

    val number2 = 10
    val number3 = 20
    val maxNumber = if (number2 > number3) number2 else number3

    println("maxNumber = $maxNumber")

    println("----------")

    println("\n\twhen statement\n")

    val enabled = true
    when (enabled) {
        false -> println("enabled is off")
        true -> println("enabled is on")
    }

    println("----------")

    val number4 = 30
    when (number4) {
        10 -> println("number4 = 10")
        20, 30 -> println("number4 = 20 or 30")
        else -> println("number4 has an undefined value")
    }

    println("----------")

    println("\n\twhen with modification\n")

    var number5 = 10
    when (number5) {
        10 -> {
            println("number5 is 10")
            number5 *= 2
        }

        20, 30 -> {
            println("number5 is 20 or 30")
            number5 *= 5
        }

        else -> {
            println("number5 has an undefined value")
        }
    }
    println("number5 = $number5")

    println("----------")

    println("\n\tAnother example with when\n")

    val number6 = 12
    when (number6) {
        in 10..19 -> println("number6 is in the range 10 to 19")
        in 20..29 -> println("number6 is in the range 20 to 29")
        !in 30..39 -> println("number6 is not in the range 30 to 39") // Will not execute because the first when branch matches
        else -> println("number6 has an undefined value")
    }

    println("----------")

    println("\n\twhen with computed value\n")

    val number7 = 10
    val number8 = 15
    when (val sum = number7 + number8) {
        10 -> println("sum = 10")
        20 -> println("sum = 20")
        number8 + 5 -> println("This is also possible")
        else -> println("sum = $sum")
    }

    println("\n\twhen used as a variable value\n")

    val number9 = 1000
    val result = when (number9) {
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }
    println("result = $result")
}