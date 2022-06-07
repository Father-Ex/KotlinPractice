package chap02.section3

fun main() {
    var str1:String? = "Hello Kotlin"
    str1 = null
    println("str1 : $str1, length : ${str1?.length?:-1}")

    val a:Int = 1
    val b:Double = a.toDouble()
    val c:Double = 1.7
    val d:Long = 36L
    println(a+d)

}