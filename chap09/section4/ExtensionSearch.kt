package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("c", 100), Pair("D", 200))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    println("elementAt = ${list.elementAt(1)}")
    println("elementAtOrElse = ${list.elementAtOrElse(10, {"범위를 벗어남"})}")
    println("elementAtOrNull = ${list.elementAtOrNull(10)}")

    println("first = "+listPair.first{it.second==200})
    println("last = "+listPair.last{it.second==200})

    println(list.first{it%2==0})
    println(list.indexOfFirst{it%2==0})

    println(listRepeated.single{it==3})
    println(listRepeated.singleOrNull{it==2})

    println(list.union(listRepeated))
    println(list.zip(listRepeated))
}