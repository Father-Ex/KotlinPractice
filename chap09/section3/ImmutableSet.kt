package chap09.section3

fun main() {
    val mixedTypeSet = setOf("Hello", 5, "world", 3.62, 'r')
    var intSet: Set<Int> = setOf<Int>(1, 5, 8)

    println(mixedTypeSet)
    println(intSet)
}