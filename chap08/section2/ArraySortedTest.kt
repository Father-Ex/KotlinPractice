package chap08.section2

import java.util.*

fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)
    val sortedNums = arr.sortedArray()
    println("원래 배열 : ${Arrays.toString(arr)}")
    println("오름차순 새 배열 : ${Arrays.toString(sortedNums)}")
    arr.sort(1, 3)
    println("arr.sort(1, 3) : ${Arrays.toString(arr)}")
    val listDesc: List<Int> = arr.sortedDescending()
    println("listDesc : $listDesc")

    var items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Po")
    items.sortWith(compareBy({it.length}, {it[0]}))
    println(Arrays.toString(items))
}