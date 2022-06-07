package chap09.section3

import java.util.*

fun main() {
    val intSortedSet: TreeSet<Int> = sortedSetOf(4, 1, 7, 2)
    println(intSortedSet)

    intSortedSet.add(6)
    intSortedSet.remove(1)
    println(intSortedSet)

    intSortedSet.clear()
    println(intSortedSet)
}