package chap03

fun main() {
    println("funcFunc : ${funcFunc()}")
}

fun sum2(a:Int, b:Int) = a+b

fun funcFunc():Int{
    return sum2(2, 2)
}