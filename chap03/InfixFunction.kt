package chap03

fun main() {
    //일반 표현법
    //val multi = 3.multiply(10)

    //중위 표현법
    val multi = 3 multiply 10
    println("multi = $multi")
}

//Int클래스의 확장함수이며 infix로 중위 표현 가능
infix fun Int.multiply(x:Int):Int{
    return this*x
}