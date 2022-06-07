package chap05.section4

open class A{
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

interface B{
    //클래스는 상속을 위해 open 키워드를 쓰지만 인터페이스는 기본적으로 open 상태임
    fun f() = println("B Interface f()")
    fun b() = println("B Interface b()")
}

class C : A(), B{//코틀린도 자바와 같이 클래스는 1개만 상속 가능하고 인터페이스는 여러개 가능
    override fun f() = println("C Class f()")

    fun test(){
        f()
        b()
        super<A>.f()
        super<B>.f()
    }
}

fun main() {
    val c = C()
    c.test()
}