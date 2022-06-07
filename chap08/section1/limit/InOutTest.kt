package chap08.section1.limit

open class Animall
class Catt : Animall()
class Dogg : Animall()

fun copyAnimal(from: Array<out Animall>, to: Array<Animall>){
    for(i in from.indices){
        to[i] = from[i]
    }
}

fun main() {
    val animals: Array<Animall> = arrayOf(Animall(), Animall())
    val cats: Array<Catt> = arrayOf(Catt(), Catt())

    copyAnimal(cats, animals)
    var c1: Catt = Catt()
    var d1: Dogg = Dogg()

    var a1: Animall = c1
    a1 = d1
}