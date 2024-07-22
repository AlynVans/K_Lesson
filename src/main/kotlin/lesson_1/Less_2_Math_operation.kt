package lesson_1

fun main() {

    println("\n\tОбычные математические операции\n")

    val x = 10
    val y = 3
    val v: Double = 2.0
    var z: Any

    z = x + y
    println("x + y = z = $z")

    z = x - y
    println("x - y = z = $z")

    z = x * y
    println("x * y = z = $z")

    z = x / y
    println("x / y = z = $z")

    z = z / v
    println("x / v = z = $z")

    z = x % y
    println("x % y = z = $z")

    println("\n\tIncrement/Decrement\n")

    var a1 = 5
    println("a1 = $a1")
    val b1 = ++a1
    println("a1 = $a1")
    println("b1 = $b1")

    println("------")

    var a2 = 5
    println("a2 = $a2")
    val b2 = a2++
    println("a2 = $a2")
    println("b2 = $b2")

    println("------")

    var a3 = 5
    println("a3 = $a3")
    val b3 = --a3
    println("a3 = $a3")
    println("b3 = $b3")

    println("------")

    var a4 = 5
    println("a4 = $a4")
    val b4 = a4--
    println("a4 = $a4")
    println("b4 = $b4")

    println("------")

}