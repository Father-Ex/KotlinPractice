package chap07.section2

class Outer{
    val ov = 5
    class Nested{
        val nv = 10
        fun greeting() = "[Nested] nv = $nv"
    }
    fun outside(){
        val msg = Nested().greeting()
    }
}

fun main() {
    val output = Outer.Nested().greeting()
}