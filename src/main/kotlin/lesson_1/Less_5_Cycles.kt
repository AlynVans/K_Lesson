package lesson_1

fun main() {

    println("\n\tцикл for\n")

    for (n in 1..9) {
        print("${n * n} \t")
    }

    println()
    println("----------")

    println("\n\tцикл for в цикле\n")

    for (i in 1..9) {
        for (j in 1..9) {
            print("${i * j} \t")
        }
        println()
    }

    println("----------")

    println("\n\tцикл while\n")

    var i3 = 10
    while (i3 > 0) {
        println(i3 * i3)
        i3--;
    }

    println("----------")

    println("\n\tцикл do/while\n")

    var i4 = -1
    do {
        println(i4 * i4)
        i4--;
    } while (i4 > 0)

    println("----------")

    println("\n\tcontinue/break\n")

    for (n in 1..10) {
        if (n == 3) continue;
        if (n == 5) break;
        println(n)
    }

    println("-----------")

}