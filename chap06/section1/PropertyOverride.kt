package chap06.section1

open class First{
    open val x: Int = 0
        get(){
            println("First class")
            return field
        }
    val y: Int = 0
}

class Second : First(){
//    override val x: Int = 0
//        get(){
//            println("Second class")
//            return field+3
//        }
    val str: String
    init{
        str = "asdf"
    }
}

fun main() {
    val second = Second()
    println(second.x)
    println(second.y)
}