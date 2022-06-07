package chap05.section4.innerref

open class Base{
    open val x: Int = 1
    open fun f() = println("Base Class f()")
}

class Child : Base(){
    override val x: Int = super.x+1
    override fun f() = println("Child Class f()")
    //val t = super.f()

    inner class Inside{
        fun f() = println("Inside Class f()")
        fun test(){
            f()//현재 클래스(inner class)의 함수
            Child().f()//바깥 클래스에 생성자로 접근
            super@Child.f()//Child의 부모
            println("[Inside] super@Child.x : ${super@Child.x}")
        }
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test()
}