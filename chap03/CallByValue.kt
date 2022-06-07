package chap03

fun main() {
    val result = callByValue(lambda())
    println(result)
}

fun callByValue(b:Boolean):Boolean{
    println("callByValue 실행")
    return b
}

val lambda:()->Boolean = {
    println("lambda 실행")
    true
}