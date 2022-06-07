package chap06.section2.bylazyobj

import chap03.sum

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInst: Boolean = false

    //by lazy의 선언 위치가 변수 이름이 아닌 타입 다음이므로 person 변수 자체가 아닌 Person 객체에 대한 위임
    //따라서 person변수의 타입은 Person으로 고정이며 lazy블럭 안에서도 반드시 Person객체를 리턴해야 함
    val person: Person by lazy {
        isPersonInst = true
        Person("Kim", 23)
    }

    //대입 연산자와 lazy함수 사용시 변수의 타입은 Person이 아닌 Lazy<Person>이며
    //Person객체에 접근하려면 [변수명.value]와 같이 써야 한다
    val personDelegate = lazy {
        Person("Hong", 40)
    }
    println()
    println("person 초기화여부 : $isPersonInst")
    println("personDelegate 초기화여부 : ${personDelegate.isInitialized()}")
    println("---------------------------------")
    println("person.name = ${person.name}")
    println("personDelegate.value.name = ${personDelegate.value.name}")
    println("---------------------------------")
    println("person 초기화여부 : $isPersonInst")
    println("personDelegate 초기화여부 : ${personDelegate.isInitialized()}")
}