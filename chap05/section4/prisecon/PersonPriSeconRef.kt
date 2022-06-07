package chap05.section4.prisecon

class Person(firstName: String, out: Unit = println("[Primary Constructor] Parameter")){
    val fName = println("[Property] Person fName : $firstName")

    init{
        println("[init] Person init block")
    }
    //아래와 같이 부 생성자에서 주 생성자로 일단 넘어가면 프로퍼티와 초기화 블록이 완료된 후에 다시 부 생성자로 돌아온다
    constructor(firstName: String, age: Int, out: Unit = println("[Secondary Constructor] Parameter")): this(firstName){
        println("[Secondary Constructor] Body : $firstName, $age")
    }
}

fun main() {
    val p1 = Person("Kildong", 30)
    //println()
    //val p2 = Person("Dooly")
}