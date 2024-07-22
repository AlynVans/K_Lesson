package lesson_1

fun main() {

    println("\n\tRange\n")

    val range1 = 1..5
    println(range1)

    println("----------")

    println("\n\tReverse Range\n")

    val reverseRange1 = 5 downTo 1
    println(reverseRange1)

    println("----------")

    println("\n\tRange with Step of 2\n")

    val stepRange1 = 1..10 step 2
    println(stepRange1)

    println("----------")

    println("\n\tReverse Range with Step of 3\n")

    val reverseStepRange1 = 10 downTo 1 step 3
    println(reverseStepRange1)

    println("----------")

    println("\n\tRange until 9, exclusive\n")

    val untilRange1 = 1 until 9
    println(untilRange1)

    println("----------")

    println("\n\tCharacter Range\n")

    val charRange = "a".."f"
    println(charRange)

    println("----------")

    println("\n\tBoolean Ranges\n")

    val range2 = 1..5

    val isInRange1 = 5 in range2
    println(isInRange1)  // true

    val isInRange2 = 86 in range2
    println(isInRange2)  // false

    val isNotInRange1 = 6 !in range2
    println(isNotInRange1)  // true

    val isNotInRange2 = 3 !in range2
    println(isNotInRange2)  // false

    println("----------")

    println("\n\tIterating through Ranges\n")

    val reverseRange2 = 5 downTo 1
    for (num in reverseRange2) print(num)  // 54321
    println()

    val charRange2 = 'a'..'d'
    for (char in charRange2) print(char)  // abcd
    println()

    for (num in 1..9) print(num)  // 123456789
    println()

    for (num in 1 until 9) print(num)  // 12345678
    println()

    for (num in 1..9 step 2) print(num)  // 13579

    println("\n----------")
}