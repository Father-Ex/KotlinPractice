package chap08.section2

fun main() {
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it[0]=='a' }
        .sortedBy { it.length }
        .map { it.uppercase() }
        .forEach{println(it)}
    var str: String = "abcdef"
    str = str.substring(0..1)+"x"+str.substring(3..str.length-1)
    println(str)
    val test: Test<Number> = Test<Int>(337)
    test.printT()
}
class Test<out T> (val p: T){
    fun printT(): Unit{
        println("param = $p")
    }
}