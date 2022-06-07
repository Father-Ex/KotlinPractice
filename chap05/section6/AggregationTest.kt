package chap05.section6

class Pond(_name: String, _members: MutableList<Duck>){
    val name: String = _name
    val members: MutableList<Duck> = _members
    constructor(_name: String): this(_name, mutableListOf<Duck>())
}

class Duck(val name: String){
    fun test(){
        val pond = Pond("myFavorite")
        val duck1 = Duck("1번")
        val duck2 = Duck("2번")

        pond.members.add(duck1)
        pond.members.add(duck2)
        for(duck in pond.members){
            println(duck.name)
        }
    }
}

fun main() {
    Duck("두릅").test()
}