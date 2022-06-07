package chap02.section3

fun main() {
    val a:Int = 128
    val b:Int? = 128
    println("a==b : ${a==b}")
    println("a===b : ${a===b}")
    //b = null
    //println("a===b : ${a===b}")//NPE 발생! 엘비스 연산자 필요
}