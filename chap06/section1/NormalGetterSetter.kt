package chap06.section1

class User(_id: Int, _name: String, _age: Int){
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value){
            field = value
        }

    var age: Int = _age
        get() = field
        set(value){
            field = value
        }
}

fun main() {
    val user1 = User(1, "마동석", 30)
    //user1.id = 2 //id는 val이므로 변경 불가
    user1.age = 50
    println("user1.age = ${user1.age}")
}