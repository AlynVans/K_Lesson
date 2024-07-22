package lesson_1

fun main() {

    println("\n\tмассив\n")

    val a1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val b2 = Array(3) { 5 }
    val n1 = a1[1]
    a1[2] = 7

    println("n1 = $n1")
    println("a1[2] = ${a1[2]}")
    println("b2 = ${b2[1]}")

    println("\n\tперебор массива\n")

    val a2 = arrayOf(1, 2, 3, 4, 5)
    for (b2 in a2) { // Берёт n-ый элемент из массива и передаёт в b2 и равняется a2, и сразу после принтит
        print("$b2\t")
    }

    println("\n----------")

    val с2 = arrayOf("Tom", "Sam", "Bob")
    var i2 = 0
    while (i2 in с2.indices) { // Берёт n-ый элемент из массива и принтит
        println(с2[i2])
        i2++
    }

    println("----------")

    println("\n\tпроверка на содержание\n")

    val d2: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(4 in d2)    // true
    println(5 in d2)
    println(2 !in d2)   // false

    println("\n\tвиды массивов\n")

    val a3: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val b3: DoubleArray = doubleArrayOf(2.4, 4.5, 1.2)
    val c3 = FloatArray(3) { 1.5F }

    println(a3[2])
    println(b3[1])
    println(c3[1])

    println("----------")

    println("\n\tдвойные массивы\n")

    val a4 = Array(3) { Array(3) { 0 } }
    a4[0] = arrayOf(1, 2, 3)    // первая строка таблицы
    a4[0][1] = 6    // второй элемент первой строки
    a4[1] = arrayOf(4, 5, 6)    // вторая строка таблицы
    a4[2] = arrayOf(7, 8, 9)    // третья строка таблицы
    val n = a4[0][1]    // n = 6

    println(n)

    println("----------")

    println("\n\tперебор двойных массивов\n")

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