package Construtor

fun main() {

    val sam = Person_2("Sam", 1100)
    val john = Person_2("John", 45)

    println("Name: ${sam.name}  Age: ${sam.age}")
    println("Name: ${john.name}  Age: ${john.age}")
}

class Person_2(_name: String, _age: Int) {
    val name: String
    var age: Int = 0

    init { //init нужен для доп проверки всё ли ок
        name = _name
        if (_age > 0 && _age < 110) age = _age else println("$name wrong age")
    }
}