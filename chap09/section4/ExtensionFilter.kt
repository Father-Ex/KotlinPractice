package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMixed = listOf(1, "Hello", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    //특정 요소 골라내기
    println(list.filter{it%2==0})//조건에 맞는 요소만
    println(list.filterNot{it%2==0})//조건에 맞지 않는 요소만
    println(listWithNull.filterNotNull())//null이 아닌 요소만
    println("filterIndexed = "+list.filterIndexed{idx, value -> idx!=1 && value%2==0})//filter에 인덱스 추가
    val mutList = list.filterIndexedTo(mutableListOf()){idx, value -> idx!=1 && value%2==0}//조건에 맞는 요소로 새 컬렉션 생성
    println("filterIndexedTo = $mutList")

    //특정 요소 골라내기-Map

}