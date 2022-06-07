package chap06.section3

class C{
    private fun foo() = object{
        val x: String = "asdf"
    }

    fun publicFoo() = object{
        val x: String = "asdf"
    }
    fun bar(){
        val x1 = foo().x
        val x2 = publicFoo()
        println(x2.toString())
    }
}

fun main() {
    C().bar()
}