package chap02.section2

fun main() {
    //Char형 선언시 자바와 달리 정수 리터럴 사용 불가
    val chNum:Char = 'A'
    println(chNum)
    println(chNum+2)

    val code:Int = 65
    val chFromCode:Char = code.toChar()
    println(chFromCode)
    println('\uD586')
}