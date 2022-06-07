package chap08.section1.limit

open class Animal(val size: Int){
    fun feed() = println("[Animal]먹이를 준다")
}
class Cat(val jump: Int): Animal(50)
class Spider(val poison: Boolean): Animal(1)

class Box<out T: Animal>(val element: T){
    fun getAnimal(): T = element

}
