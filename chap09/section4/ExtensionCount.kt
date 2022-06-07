package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    //요소 순환
//    list.forEach{print("$it ")}
//    println()
//    list.forEachIndexed{index, value->println("index[$index] = $value")}

//    val returnedList = list.onEach { print("${it+it} ") }
//    println()
//    println("returnedList = $returnedList")

    //요소의 갯수 반환
//    println(list.count{it%2==0})

    //최댓값&최솟값 반환
    println(list.maxOf{it})//책의 min(), max()는 없는 함수. 아마 사라진 듯
    println(list.minOf{it})

    println("maxBy = ")

    println(list.fold(0){total, next->total+next*2})

    println(listPair.sumOf{it.second})
}