package chap09.section5

fun main() {
    val seq: Sequence<Int> = generateSequence(1){it+1}
    println(seq.take(10).toList())

    val square: Sequence<Int> = generateSequence(1){it+1}.map{it*it}
    println(square.take(10).toList())
}