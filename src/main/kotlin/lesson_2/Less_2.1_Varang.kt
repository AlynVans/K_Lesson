package lesson_2

fun main() {

    println() // 1

    printStrings("Tom", "Bob", "Sam")
    printStrings("Kotlin", "JavaScript", "Java", "C#", "C++")


    println() // 2

    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()
    sum(a, b, c)


    println() // 3

    printUserGroup(3, "Tom", "Bob", "Alice")


    println() // 4

    printUserGroup("KT-091", "Tom", "Bob", "Alice", count = 3)    // Либо они должны указываться с аргументами


    println() // 5

    val nums = intArrayOf(1, 2, 3, 4)
    changeNumbers(*nums, koef = 2)
}

fun printStrings(vararg strings: String) { // 1
    for (a in strings)
        println(a)
}


fun sum(vararg numbers: Int) {       // 2
    var result = 0
    for (n in numbers)
        result += n
    println("Сумма чисел равна $result")
}

fun printUserGroup(count: Int, vararg users: String) {        // 3. Если в функции есть vararg, то он пишется последним
    println("Count: $count")
    for (user in users)
        println("User: $user")
}

fun printUserGroup(
    group: String,
    vararg users: String,
    count: Int
) {         // 4. Либо они должны указываться с аргументами
    println("Group: $group")
    println("Count: $count")
    for (user in users)
        println(user)
}

fun changeNumbers(vararg numbers: Int, koef: Int) {          //5
    for (i in numbers)
        println(i * koef)
}