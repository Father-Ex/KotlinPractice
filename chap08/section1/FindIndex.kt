package chap08.section1

fun <T> find(a: Array<T>, target: T): Int{
    for(i in a.indices){
        if(a[i]==target) return i
    }
    return -1
}

fun main() {
    val arr1: Array<String> = arrayOf("Apple", "Banana", "Cherry", "Damn")
    val arr2: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    println("arr1.indices = ${arr1.indices}")
    println("arr2.indices = ${arr2.indices}")
    println(find<String>(arr1, "Cherry"))
    println(find(arr2, 4))//타입 매개변수가 추론 가능할 경우 명시적으로 지정하지 않아도 됨
}