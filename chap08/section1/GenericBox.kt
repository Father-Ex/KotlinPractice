package chap08.section1

class Box<T>(t: T){
    var name = t
    var name2: String? = null
}
class MyClass<T>(var myProp: T){
    fun method(a: T){
        println("a의 값 = $a, a의 클래스 = ${a!!::class}")
    }
}

fun main() {
    val box1: Box<Int> = Box<Int>(33)
    val box2: Box<String> = Box<String>("인자값 넘김")
    println(box1.name)
    println(box2.name)
    val ctest = MyClass<String>("크어억")
    ctest.method("빠라밤")
}