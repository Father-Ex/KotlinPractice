package chap02.section3

fun main() {
    checkArg("더워")
    checkArg(37)
}
fun checkArg(x:Any){
    if(x is String){
        println("x is String : $x")
    }
    if(x is Int){
        println("x is Int : $x")
    }
    if(x is Number){
        println("x is Number : $x")
    }
}