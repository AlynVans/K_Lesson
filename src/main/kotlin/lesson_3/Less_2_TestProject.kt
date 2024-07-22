fun main() {
    val atomicKotlin = Book("AtomicKotlin", "Unknown", 2021)
    atomicKotlin.printDetails()
}

class Book(val name: String, var author: String) {
    var year: Int = 0

    constructor(name: String, author: String, year: Int) : this(name, author) {
        this.year = year
    }

    init {
        println("Создана новая книга: $name")
    }

    fun printDetails() {
        println(
            """
            Name: $name
            Author: $author
            Year: $year
        """.trimIndent()
        )
    }
}