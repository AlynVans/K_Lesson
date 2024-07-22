package lesson_1

fun main() {

    // Demonstrating a for loop
    println("\n\tFor Loop\n")
    for (n in 1..9) {
        print("${n * n} \t")
    }

    println()
    println("----------")

    // Demonstrating a nested for loop
    println("\n\tNested For Loop\n")
    for (i in 1..9) {
        for (j in 1..9) {
            print("${i * j} \t")
        }
        println()
    }

    println("----------")

    // Demonstrating a while loop
    println("\n\tWhile Loop\n")
    var i3 = 10
    while (i3 > 0) {
        println(i3 * i3)
        i3--
    }

    println("----------")

    // Demonstrating a do-while loop
    println("\n\tDo/While Loop\n")
    var i4 = -1
    do {
        println(i4 * i4)
        i4--
    } while (i4 > 0)

    println("----------")

    // Demonstrating continue and break in a loop
    println("\n\tContinue/Break\n")
    for (n in 1..10) {
        if (n == 3) continue
        if (n == 5) break
        println(n)
    }

    println("-----------")

}
