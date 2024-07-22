package email

fun main() {

    val fn = outer() // fn = inner, так как функция outer возвращает функцию inner
    // вызываем внутреннюю функцию inner
    fn() // 6
    fn() // 7
    fn() // 8
    fn()
    outer()
}

fun outer(): () -> Unit {       // внешняя функция
    var n = 5         // некоторая переменная - лексическое окружение функции inner
    fun inner() {     // вложенная функция
        // действия с переменной n
        n++
        println(n)
    }
    return ::inner



















//    val counter1 = createCounter()  // создаем первый счетчик
//    val counter2 = createCounter()  // создаем второй счетчик
//
//    println(counter1())  // Выводит: 1
//    println(counter1())  // Выводит: 2
//    println(counter2())  // Выводит: 1
//    println(counter1())  // Выводит: 3
//    println(counter2())  // Выводит: 2
//}
//
//fun createCounter(): () -> Int {
//    var count = 0  // переменная count определена в функции createCounter
//    return {
//        count += 1  // каждый вызов этой функции увеличивает count на 1
//        count       // возвращает текущее значение count
//    }
}
