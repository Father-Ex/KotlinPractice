package chap03

fun main() {
    shortFunc(3){
        println("First call:$it")
        //return
    }
}

inline fun shortFunc(a:Int, crossinline out:(Int)->Unit){
    println("out 호출 전")
    out(a)
    println("out 호출 후")
}