package chap02.section2

typealias Username = String

fun main() {
    var num = 10
    val formattedString = """
        var a = 6
        var b = "Kotlin"
        println(a+num)
    """//.trimIndent()
    println(formattedString)

    val name:Username = "박남국"
    println(name)

}

