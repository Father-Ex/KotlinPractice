package chap02.section3

fun main() {
    val number1 = 5
    val number2 = -5

    println(number1 shr 1)
    println(number1 ushr 1)
    println(number2 shr 1)
    println(number2 ushr 1)

    println(plus(y = 55))
}
fun plus(x:Int = 11, y:Int = 22):Int = x+y