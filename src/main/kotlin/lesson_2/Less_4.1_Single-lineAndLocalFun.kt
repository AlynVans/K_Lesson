package org.example.Lesson_2

fun main() {

    val a = scan.nextInt()
    square(a)
    println("a = $a")

    val b = scan.nextInt()
    val c = scan.nextInt()
    compareAge(b, c)

}

fun square(x: Int) = x * x

fun compareAge(age1: Int, age2: Int) {

    fun ageIsValid(age: Int) = age > 0 && age < 111

    if (!ageIsValid(age1) || !ageIsValid(age2)) {
        println("Invalid age")
        return
    }

    when {
        age1 == age2 -> println("age1 == age2")
        age1 > age2 -> println("age1 > age2")
        age1 < age2 -> println("age1 < age2")
    }
}