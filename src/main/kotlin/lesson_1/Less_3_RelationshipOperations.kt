package lesson_1

fun main() {
    println("\n\tBoolean\n")

    // Define two integer variables
    val a1 = 11
    val b1 = 12

    // Boolean comparisons between a1 and b1
    val x1: Boolean = a1 > b1
    val x2: Boolean = a1 < b1
    val x3: Boolean = a1 == b1
    val x4: Boolean = a1 != b1

    // Print results of comparisons
    println("a1 > b1 = $x1")
    println("a1 < b1 = $x2")
    println("a1 == b1 = $x3")
    println("a1 != b1 = $x4")

    println("\n\tShortened Version\n")

    // Boolean comparisons with literals
    val y1 = 35 > 12
    val y2 = 35 < 12
    val y3 = 35 == 12
    val y4 = 35 != 12

    // Print results of comparisons
    println("35 > 12 = $y1")
    println("35 < 12 = $y2")
    println("35 == 12 = $y3")
    println("35 != 12 = $y4")

    println("\n\tLogical Operations\n")

    // Define two boolean variables
    val e1 = true
    val f1 = false

    // Logical operations between e1 and f1
    val g1 = e1 and f1
    val g2 = e1 or f1
    val g3 = e1 xor f1
    val g4 = e1 && f1
    val g5 = e1 || f1

    // Print results of logical operations
    println("e1 and f1 = $g1") // Returns true if both operands are true
    println("e1 or f1 = $g2") // Returns true if one of the operands is true
    println("e1 xor f1 = $g3") // Returns true if only one of the operands is true. If operands are equal, returns false
    println("e1 && f1 = $g4") // Returns true if both operands are true
    println("e1 || f1 = $g5") // Returns true if one of the operands is true

    println("\n\tFun Operations\n")

    // Boolean negations
    val a2 = true
    val b2 = !a2
    val c2 = !b2

    // Print results of negations
    println("a2 = $a2")
    println("b2 = $b2")
    println("c2 = $c2")

    println("------")

    // Alternative negation method
    val d2 = a2.not() // alternative to ! operator
    val e2 = b2.not()

    // Print results of alternative negations
    println("d2 = a2.not() = $d2") // alternative to ! operator
    println("e2 = b2.not() = $e2")

    println("------")

    // Range checks
    val a3 = 5
    val b3 = a3 in 1..6
    val c3 = a3 in 10..15

    // Print results of range checks
    println("a3 = $a3")
    println("b3 = a3 in 1..6 = $b3")
    println("c3 = a3 in 10..15 = $c3")

    println("------")

    // Range checks with negation
    val b4 = a3 !in 1..6
    val c4 = a3 !in 10..15

    // Print results of range checks with negation
    println("a3 = $a3")
    println("b4 = a3 !in 1..6 = $b4")
    println("c4 = a3 !in 10..15 = $c4")

    println("------")

    // Complex logical operation
    val h1 = (11 >= 5) and (9 < 10)

    // Print result of complex logical operation
    println("h1 = (11 >= 5) and (9 < 10) = $h1")

    println("------")
}