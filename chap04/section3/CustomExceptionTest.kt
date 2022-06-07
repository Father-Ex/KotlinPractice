package chap04.section3

class InvalidNameException(message: String) : Exception(message)

fun main(){
    var name = "길동 1357"

    try {
        validateName(name)
    } catch (e: InvalidNameException) {
        println(e.message)
    } catch (e: Exception) {
        println(e.message)
    }
}

fun validateName(name: String){
    if(name.matches(Regex(".*\\d+.*"))){
        throw InvalidNameException("이름에 숫자가 있음\n이름 : $name")
    }
}