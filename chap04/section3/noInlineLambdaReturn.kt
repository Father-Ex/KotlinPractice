package chap04.section3

fun main() {
    noretFunc()
}

fun noinlineLambda(a:Int, b:Int, out:(Int, Int)->Unit){
    out(a, b)
    println("noinline END")
}

fun noretFunc(){
    println("start of retFunc")
    noinlineLambda(13, 3) {a, b->
        val result = a+b
        if(result>10) return@noinlineLambda
        println("result:$result")
    }
    println("end of retFunc")
}