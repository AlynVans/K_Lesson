package org.example.Lesson_2

fun main() {

    println() //1

    fun(x: Int, y: Int): Int = x + y

    println() //2

    fun(x: Int, y: Int): Int {
        return x + y
    }

    println() //3

    val message = fun() = println("Hello")
    message()

    println() //4

    val sum = fun(x: Int, y: Int): Int = x + y
    val result = sum(5, 4)
    println(result)     // 9

    println() //5

    doOperation(9, 5, fun(x: Int, y: Int): Int = x + y)     // 14
    doOperation(9, 5, fun(x: Int, y: Int): Int = x - y)      // 4

    val action = fun(x: Int, y: Int): Int = x * y
    doOperation(9, 5, action)       // 45


    println() //6

    val action1 = selectAction(1)
    val result1 = action1(4, 5)
    println(result1)        // 9

    val action2 = selectAction(3)
    val result2 = action2(4, 5)
    println(result2)        // 20

    val action3 = selectAction(9)
    val result3 = action3(4, 5)
    println(result3)        // 0

}

fun doOperation(x: Int, y: Int, op: (Int, Int) -> Int) {  //5
    val result = op(x, y)
    println(result)
}

fun selectAction(key: Int): (Int, Int) -> Int { //6
    // определение возвращаемого результата
    when (key) {
        1 -> return fun(x: Int, y: Int): Int = x + y
        2 -> return fun(x: Int, y: Int): Int = x - y
        3 -> return fun(x: Int, y: Int): Int = x * y
        else -> return fun(x: Int, y: Int): Int = 0
    }
}