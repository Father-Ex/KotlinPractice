package chap04.section2

fun main() {
    var sum = 0
    for(x in 1..10) sum += x
    println(sum)
    for(x in 10 downTo 1 step 2) println(x)
}
fun hello(name:String){
    println("빠밤")
    return Unit
}