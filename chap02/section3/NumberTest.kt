package chap02.section3

fun main() {
    var test:Number = 12.2
    println("$test")
    println(test.javaClass)

    test = 12
    println("$test")
    println(test.javaClass)

    test = 137L
    println("$test")
    println(test.javaClass)

    test += 11.0f
    println("$test")
    println(test.javaClass)
}