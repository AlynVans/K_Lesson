package lesson_1

fun main() {

    println("\n\tArray Operations\n")

    val a1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val b2 = Array(3) { 5 }
    val n1 = a1[1]
    a1[2] = 7

    println("n1 = $n1")
    println("a1[2] = ${a1[2]}")
    println("b2[1] = ${b2[1]}")

    println("\n\tIterating Over Array\n")

    val a2 = arrayOf(1, 2, 3, 4, 5)
    for (b2 in a2) {
        print("$b2\t")
    }

    println("\n----------")

    val c2 = arrayOf("Tom", "Sam", "Bob")
    var i2 = 0
    while (i2 in c2.indices) {
        println(c2[i2])
        i2++
    }

    println("----------")

    println("\n\tArray Contains Check\n")

    val d2: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(4 in d2)  // true
    println(5 in d2)  // true
    println(2 !in d2) // false

    println("\n\tDifferent Array Types\n")

    val a3: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val b3: DoubleArray = doubleArrayOf(2.4, 4.5, 1.2)
    val c3 = FloatArray(3) { 1.5F }

    println(a3[2])
    println(b3[1])
    println(c3[1])

    println("----------")

    println("\n\t2D Arrays\n")

    val a4 = Array(3) { Array(3) { 0 } }
    a4[0] = arrayOf(1, 2, 3) // first row
    a4[0][1] = 6             // second element of the first row
    a4[1] = arrayOf(4, 5, 6) // second row
    a4[2] = arrayOf(7, 8, 9) // third row
    val n = a4[0][1]         // n = 6

    println(n)

    println("----------")

    println("\n\tIterating Over 2D Arrays\n")

    val a5: Array<Array<Int>> = Array(3) { Array(3) { 0 } }
    a5[0] = arrayOf(1, 2, 3)
    a5[1] = arrayOf(4, 5, 6)
    a5[2] = arrayOf(7, 8, 9)
    for (b5 in a5) {
        for (c5 in b5) {
            print("$c5 \t")
        }
        println()
    }

    println("----------")
}