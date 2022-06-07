package chap08.section1

import chap03.multiply

typealias custom<X> = (X, X)->X

fun <T> add(a: T, b: T, cal: custom<T>): T{
    return cal(a, b)
}
fun main() {
    val result = add(14, 23){x, y->(x multiply 2)+y}
    println("result = $result")
}
//358