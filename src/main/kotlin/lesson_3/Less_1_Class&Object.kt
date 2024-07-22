class PersonTest // Если не имеет тело, то скобки можно пропустить

fun main() {
    val tom: PersonTest // Можно определять переменные этого типа
    val bob = Person() // Создание объекта со значениями по умолчанию

    // Вывод информации о Bob до изменения свойств
    println(bob.name)
    println(bob.age)
    bob.sayHello()
    bob.personInfo()

    // Изменение свойств объекта Bob
    bob.name = "Bob"
    bob.age = 20

    // Вывод информации о Bob после изменения свойств
    println(bob.name)
    println(bob.age)
    bob.sayHello()
    bob.personInfo()
}


class Person {
    var name: String = "Undefined"
    var age: Int = 18

    fun sayHello() {
        if (name == "Undefined") {
            println("Unknown")
        } else {
            println("Hello my name is $name")
        }
    }

    fun personInfo() {
        if (name == "Undefined") {
            println("Unknown")
        } else {
            println("My name is $name, my age is $age")
        }
    }
}