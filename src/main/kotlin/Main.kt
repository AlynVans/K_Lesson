package org.example

fun findMiddleNumber(a: Int, b: Int, c: Int): Int {
    return listOf(a, b, c).sorted()[1]
}

fun main() {

    val (a, b, c) = readln().split(" ").map { it.toInt() }

    val result = findMiddleNumber(a, b, c)
    println(result)
}