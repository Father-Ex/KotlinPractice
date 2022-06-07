package chap06.section2

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0){
        prop, old, new -> new>old
    }
}