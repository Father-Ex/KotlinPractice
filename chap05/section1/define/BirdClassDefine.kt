package chap05.section1.define

class Bird{
    var name: String = "mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    fun fly() {
        println("$wing 개의 날개로 난다")
    }
    fun sing(vol: Int) = println("$vol 의 크기로 운다")
}

fun main() {
    val coco = Bird()
    coco.color = "green"

    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(5)
}