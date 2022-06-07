package chap03

fun main() {
    //-------------------익명 함수의 매개변수에는 기본값 지정 불가
    //-------------------익명 함수에는 return 사용 불가
    var result:Int
    //람다식 대입
    val multi = {x:Int, y:Int->
        println(x*y)
        x*y
    }
    //익명함수(?) 대입
    val multi2 = fun(a:Int, b:Int):Int{
        return a*b
    }

    result = multi(3, 5)
    println(result)
    result = multi2(4, 6)
    println(result)

    //함수안에 함수 선언
    fun addi(c:Int, d:Int):Int{
        return c+d
    }
    println(addi(21, 34))
}