package chap03

fun main() {
    val fnum = 15888
    println("${fnum}팩토리얼 = ${fact(fnum)}")
}

tailrec fun fact(n:Int, run:Int = 1):Long{
    return if(n==1) run.toLong() else fact(n-1, run*n)
}

