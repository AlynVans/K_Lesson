package lesson_1

//fun main(){
//
//    val range = 1..20
//
//    for (i in range) {
//        if(i % 2 == 0 )
//        println(i)
//    }
//
//}

//fun main(){
//
//    println( rangeCalculator(1, 10))
//
//}
//
//fun rangeCalculator(num1: Int, num2: Int):Int{
//
//    var a = num1..num2
//    var b = 0
//
//    for(i in a){
//       b += i
//    }
//
//    return b
//}

fun main() {

    val num1 = readLine()?.toIntOrNull() ?: 0
    val num2 = readLine()?.toIntOrNull() ?: 0
    val range = num1..num2

    for (i in range) {
        println(i)
    }
}