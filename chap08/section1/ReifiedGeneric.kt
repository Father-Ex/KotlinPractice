package chap08.section1

fun main() {
    val result = getType<Float>(10)
    println("result = $result")
    val list = java.util.ArrayList<Int>()
    list.add(1)
    list.add(3)
    list.add(6)
    println(list.toString())
}

inline fun <reified T> getType(value: Int): T{
    println(T::class)
    println(value.javaClass)
    return value as T
}