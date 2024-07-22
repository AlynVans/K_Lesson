package lesson_1

fun main() {

    println("\n\tдиапазон\n")

    val a1 = 1..5;
    print(a1)

    println("----------")

    println("\n\tобратный диапазон\n")

    val a2 = 5 downTo 1
    println(a2)

    println("----------")

    println("\n\tдиапазон с шагом в 2\n")

    val a3 = 1..10 step 2
    println(a3)

    println("----------")

    println("\n\tобратный диапазон с шагом в 3\n")

    val a4 = 10 downTo 1 step 3
    println(a4)

    println("----------")

    println("\n\tдиапазон до 9, 9 не включительно\n")

    val a5 = 1 until 9
    println(a5)

    println("----------")

    println("\n\tдиапазон по буквам\n")

    val a6 = "a".."f"
    println(a6)

    println("----------")

    println("\n\tдиапазоны по Boolean\n")

    val a7 = 1..5

    var isInRange = 5 in a7
    println(isInRange)      // true

    isInRange = 86 in a7
    println(isInRange)      // false

    var isNotInRange = 6 !in a7
    println(isNotInRange)   // true

    isNotInRange = 3 !in a7
    println(isNotInRange)   // false

    println("----------")

    println("\n\tперебор диапазонов\n")

    val a8 = 5 downTo 1
    for (c in a8) print(c)   // 54321
    println()

    val b8 = 'a'..'d'
    for (c in b8) print(c)   // abcd
    println()

    for (c in 1..9) print(c)     // 123456789
    println()

    for (c in 1 until 9) print(c)    // 12345678
    println()

    for (c in 1..9 step 2) print(c)  // 13579

    println("\n----------")

}