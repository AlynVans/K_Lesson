package lesson_1

const val MAX_AGE = 120 // Константа максимального возраста

fun main() {
    // Приветственное сообщение
    println(
        """Hello Again!
       $MAX_AGE
       Test2"""
    )

    // Работа с числами
    println("\n\tNumbers\n")

    val byteVal: Byte = -128
    println("This variable is of type Byte - $byteVal")
    val shortVal: Short = -32_768
    println("This variable is of type Short - $shortVal")
    val intVal: Int = -2_147_483_648
    println("This variable is of type Int - $intVal")
    val longVal: Long = -9_223_372_036_854_775_807
    println("This variable is of type Long - $longVal")

    // Работа с положительными числами
    println("\n\tPositive numbers\n")

    val uByteVal: UByte = 255u
    println("This variable is of type UByte - $uByteVal")
    val uShortVal: UShort = 65_535u
    println("This variable is of type UShort - $uShortVal")
    val uIntVal: UInt = 4_294_967_295u
    println("This variable is of type UInt - $uIntVal")
    val uLongVal: ULong = 18_446_743_999_999_999_999u
    println("This variable is of type ULong - $uLongVal")

    // Работа с числами с плавающей точкой
    println("\n\tС плавающей точкой\n")

    val floatVal: Float = 1.2345676f
    println("This variable is of type Float - $floatVal")
    val doubleVal: Double = 1.123456787654321
    println("This variable is of type Double - $doubleVal")

    // Строки и логические переменные
    println("\n\tСтроковые и логические\n")

    val charVal: Char = 'A'
    println("This variable is of type Char - $charVal")
    val stringVal: String = "Text"
    println("This variable is of type String - $stringVal")
    val booleanTrue: Boolean = true
    println("This variable is of type Boolean - $booleanTrue")
    val booleanFalse: Boolean = false
    println("This variable is of type Boolean - $booleanFalse")

    // Работа с типом Any
    println("\n\tAny\n")

    var anyVal: Any = "Tom"
    println("Variable of type String = $anyVal")
    anyVal = 1234
    println("Variable of type Int = $anyVal")

    // Ввод данных
    println("\n\tПрикол\n")

    print("Enter your name: ")
    val name = readLine()
    println("Hi: $name")
}