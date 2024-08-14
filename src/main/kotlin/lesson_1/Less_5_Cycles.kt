package lesson_1

fun main() {

    println("\n\tFor Loop\n")
    for (n in 1..9) {
        print("${n * n} \t")
    }
    println()

    println("----------")

    println("\n\tNested For Loop\n")
    for (i in 1..9) {
        for (j in 1..9) {
            print("${i * j} \t")
        }
        println()
    }

    println("----------")

    println("\n\tWhile Loop\n")
    var i3 = 10
    while (i3 > 0) {
        println(i3 * i3)
        i3--
    }

    println("----------")

    println("\n\tDo/While Loop\n")
    var i4 = -1
    do {
        println(i4 * i4)
        i4--
    } while (i4 > 0)

    println("----------")

    println("\n\tContinue/Break\n")
    for (n in 1..10) {
        if (n == 3) continue
        if (n == 5) break
        println(n)
    }

    println("-----------")

    Bruh@ for(i in 1..3){
        for(j in 1..3){
            if(j == 3) break@Bruh
            println("Hello")
        }
    }

    println("-----------")
}