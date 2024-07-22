package org.example.Lesson_2

fun main() {

    println() //1

    displayMessage(::morning)
    displayMessage(::evening)


    println() //2

    action72(5, 3, ::sum72)         // 8
    action72(5, 3, ::multiply72)    // 15
    action72(5, 3, ::subtract72)    // 2


    println() //3

    val action1 = selectAction72_3(1)
    println(action1(10, 5))    // 13

    val action2 = selectAction72_3(2)
    println(action2(8, 5))    // 3

}

//1

fun displayMessage(mes: () -> Unit) {
    mes()
}

fun morning() {
    println("Good Morning")
}

fun evening() {
    println("Good Evening")
}

//2
fun action72(n1: Int, n2: Int, op: (Int, Int) -> Int) {
    val result = op(n1, n2)
    println(result)
}

fun sum72(a: Int, b: Int): Int {
    return a + b
}

fun subtract72(a: Int, b: Int): Int {
    return a - b
}

fun multiply72(a: Int, b: Int): Int {
    return a * b
}

//3
fun selectAction72_3(key: Int): (Int, Int) -> Int {
    // определение возвращаемого результата
    when (key) {
        1 -> return ::sum72_3
        2 -> return ::subtract72_3
        3 -> return ::multiply72_3
        else -> return ::empty72_3
    }

}

fun sum72_3(a: Int, b: Int): Int {
    return a + b
}

fun subtract72_3(a: Int, b: Int): Int {
    return a - b
}

fun multiply72_3(a: Int, b: Int): Int {
    return a * b
}

fun empty72_3(a: Int, b: Int): Int {
    return 0
}