package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    //모든 요소가 일치하는지 검사
    println(list.all{it<10})
    println(list.all{it%2==0})

    //일치하는 요소가 존재하는지 검사
    println(list.any{it>10})
    println(list.any{it%2==0})

    //특정 요소의 포함여부 검사
    println("contains = ${list.contains(2)}")
    println(2 in list)
    println(map.contains(11))
    println(11 in map)

    //인자로 넘긴 요소들이 모두 포함되어 있는지 검사
    println("containsAll = ${list.containsAll(listOf(1, 2, 3))}")

    //요소가 없는지 검사
    println("none = ${list.none()}")
    println("none = ${list.none{it>6}}")

    //컬렉션이 비었는지 검사
    println("list.isEmpty() = ${list.isEmpty()}")
    println("list.isNotEmpty() = ${list.isNotEmpty()}")
}