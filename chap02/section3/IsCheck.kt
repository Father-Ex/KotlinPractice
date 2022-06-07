package chap02.section3

fun main() {
    val num:Any = 256L

    if(num is Int){
        println("Int다")
    }else if(num !is Int){
        println("Int가 아니다")
    }

    val b:Any? = 3
    val z:String? = b as? String
    println(z)

    var x:Any //자바의 Object와 같다

    x = "Hello"
    println(x.javaClass)
    if(x is String){
        println(x.length)
        println(x.javaClass)
    }
    x = 13
    println(x.javaClass)
}