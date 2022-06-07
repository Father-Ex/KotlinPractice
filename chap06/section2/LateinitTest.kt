package chap06.section2

class Person{
    lateinit var name: String

    fun test(){
        //프로퍼티 선언 위치가 함수 바깥인 경우에만 해당 코드가 동작함(함수 안에 있으면 프로퍼티가 아닌 변수)
        //또한 isInitialized는 lateinit에 대해서만 사용 가능(val의 지연 초기화를 위한 by lazy에는 사용 불가)
        if(::name.isInitialized){
            println("초기화 되었음")
        }else{
            println("초기화되지 않음")
        }
    }
}

lateinit var person1: Person

fun main() {
    val kildong = Person()
    kildong.test()
    //println("name = ${kildong.name}") //초기화 하지 않고 프로퍼티 사용시 예외 발생
    kildong.name = "Kildong"
    kildong.test()
    println("name = ${kildong.name}")
}