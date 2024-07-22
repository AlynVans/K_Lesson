package lesson_1

fun main() {

    println("\n\tBoolean\n")

    val a1 = 11
    val b1 = 12
    val x1: Boolean = a1 > b1
    val x2: Boolean = a1 < b1
    val x3: Boolean = a1 == b1
    val x4: Boolean = a1 != b1

    println("a1 > b1 = $x1")
    println("a1 < b1 = $x2")
    println("a1 == b1 = $x3")
    println("a1 != b1 = $x4")

    println("\n\tСокращённый вариант\n")

    val y1 = 35 > 12
    val y2 = 35 < 12
    val y3 = 35 == 12
    val y4 = 35 != 12

    println("35 > 12 = $y1")
    println("35 < 12 = $y2")
    println("35 == 12 = $y3")
    println("35 != 12 = $y4")

    println("\n\tLogical operations\n")

    val e1 = true
    val f1 = false
    val g1 = e1 and f1
    val g2 = e1 or f1
    val g3 = e1 xor f1

    val g4 = e1 && f1
    val g5 = e1 || f1

    println("e1 and f1 = $g1") //Возвращает true если оба операнда true
    println("e1 or f1 = $g2") //Возвращает true если один из операндов true
    println("e1 xor f1 = $g3") //Возвращает true, если только один из операндов равен true. Если операнды равны, возвращается false

    println("e1 && f1 = $g4") //Возвращает true если оба операнда true
    println("e1 || f1 = $g5") //Возвращает true если один из операндов true

    println("\n\tПриколы\n")

    val a2 = true
    val b2 = !a2
    val c2 = !b2

    println("a2 = $a2")
    println("b2 = $b2")
    println("c2 = $c2")

    println("------")

    val d2 = a2.not() // альтернатива оператору !
    val e2 = b2.not()

    println("d2 = a2.not = $d2") // альтернатива оператору !
    println("e2 = b2.not = $b2")

    println("------")

    val a3 = 5
    val b3 = a3 in 1..6
    val c3 = a3 in 10..15

    println("a3 = $a3")
    println("b3 = a3 in 1..6 = $b3")
    println("c3 = a3 in 10..15 = $c3")

    println("------")

    val b4 = a3 !in 1..6
    val c4 = a3 !in 10..15

    println("a3 = $a3")
    println("b4 = a3 !in 1..6 = $b4")
    println("c4 = a3 !in 10..15 = $c4")

    println("------")

    val h1 = (11 >= 5) and (9 < 10)

    println("h1 = (11 >= 5) and (9 < 10)")

    println("------")

}
