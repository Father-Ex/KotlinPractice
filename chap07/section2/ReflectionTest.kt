package chap07.section2

import kotlin.reflect.KClass
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

class User(val id: Int, val name: String, var grade: String = "Normal") {
    fun check(){
        if(grade=="Normal") println("등급이 보통이다")
    }
}

fun main() {
    println(User::class)
    val classInfo: KClass<User> = User::class
    classInfo.memberProperties.forEach{
        println("propertyName = ${it.name} / returnType = ${it.returnType}")
    }
    println("---------------------")
    classInfo.memberFunctions.forEach({
        println("functionName = ${it.name} / returnType = ${it.returnType}")
    })
}