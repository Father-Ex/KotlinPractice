package chap06.section2

class LazyTest{
    init{
        println("초기화")
    }

    val subject by lazy {
        println("지연 초기화 실행")
        "Kotlin Programming"//람다식과 같이 마지막 값이 리턴됨
    }
    fun flow(){
        println("아직 초기화되지 않음")
        println("----------------------")
        println(::subject.javaClass)//참조로는 지연 초기화가 실행되지 않음
        println("----------------------")
        println("subject one : $subject")
        println("subject two : $subject")
    }
}

fun main() {
    val test = LazyTest()
    test.flow()
}