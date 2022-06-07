package chap03

fun main() {
    val number = 45555
    val result:Long

    result = factorial(number)
    println("${number}팩토리얼 = $result")
}

tailrec fun factorial(n:Int):Long{
    return if(n==1){
        n.toLong()
    }else{
        n* factorial(n-1)
    }
}