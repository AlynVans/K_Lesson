package lesson_1

import java.util.*

val scan = Scanner(System.`in`)

const val maxAge = 120 //Константа
fun main() {

    println(
        """Hello Again!
       $maxAge
       Test2"""
    )

    println("\n\tNumbers\n")

    val a: Byte = -128
    println("This variable is of type Byte - $a")
    val b: Short = -32_768
    println("This variable is of type Short - $b")
    val c: Int = -2_147_483_648
    println("This variable is of type Int - $c")
    val d: Long = -9_223_372_036_854_775_807
    println("This variable is of type Long - $d")

    println("\n\tPositive numbers\n")

    val aU: UByte = 255u
    println("This variable is of type UByte - $aU")
    val bU: UShort = 65_535u
    println("This variable is of type UShort - $bU")
    val cU: UInt = 4_294_967_295u
    println("This variable is of type UInt - $cU")
    val dU: ULong = 18_446_743_999_999_999_999u
    println("This variable is of type ULong - $dU")

    println("\n\tС плавающей точкой\n")

    val e: Float = 1.2345676f
    println("This variable is of type Float - $e")
    val f: Double = 1.123456787654321
    println("This variable is of type Double - $f")

    println("\n\tСтроковые и логические\n")

    val g: Char = 'A'
    println("This variable is of type Char - $g")
    val h: String = "Text"
    println("This variable is of type String - $h")
    val i: Boolean = true
    println("This variable is of type Boolean - $i")
    val j: Boolean = false
    println("This variable is of type Boolean - $j")

    println("\n\tAny\n")

    var any: Any = "Tom"
    println("Variable e String = $any")
    any = 1234
    println("Variable e Int = $any")

    println("\n\tПрикол\n")

    print("Enter your name: ")
    val name = readLine()
    println("Hi: $name")

}