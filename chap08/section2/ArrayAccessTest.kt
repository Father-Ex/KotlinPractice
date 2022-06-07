package chap08.section2

import java.util.*

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    println("arr : ${Arrays.toString(arr)}")
    println("arr.size : ${arr.size}")
    println("arr.sum() : ${arr.sum()}")
    println("--------------------------------")
    println("arr.get(2) : ${arr.get(2)}")
    println("arr[2] : ${arr[2]}")
    println("--------------------------------")
    arr.set(2, 7)
    arr[0] = 83
    for(i in arr.indices){
        println("arr[$i] : ${arr[i]}")
    }

}