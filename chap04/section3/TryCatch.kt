package chap04.section3

fun main() {
    val a = 6
    val b = 0
    val c:Int

    try{
        c = a/b
    }catch(e:Exception){
        e.printStackTrace()
    }finally {
        println("finally블록 실행됨")
    }
}