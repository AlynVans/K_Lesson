package org.example.Lesson_2

import java.util.*

val scan = Scanner(System.`in`)

fun main() {

    println() // 1

    val a1 = sum1(4, 3)
    val b = sum1(5, 6)
    val c = sum1(6, 9)
    println("a=$a1  b=$b  c=$c")

    println() //2

    val a: Int = scan.nextInt()
    checkAge(a)
}

fun sum1(x: Int, y: Int): Int {
    return x + y
}

fun checkAge(age: Int) {
    if (age < 0 || age > 110) {
        println("Invalid age")
        return
    }
    println("Age is valid")
}