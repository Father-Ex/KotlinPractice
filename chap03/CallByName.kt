package chap03

fun main() {
    val result = callByName(lambda2)
    println(result)
}

fun callByName(b:()->Boolean):Boolean{
    println("callByName 실행")
    return b()
}

val lambda2:()->Boolean = {
    println("lambda2 실행")
    true
}