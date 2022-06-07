package chap02.section2

fun main() {
    //-----정수 자료형
    //signed : 부호있는 정수
    val num05 = 127
    val num06 = -32768
    val num07 = 2147483647
    val num08 = 922337203685477580

    val exp01 = 123
    val exp02 = 123L
    val exp03 = 0x0F
    val exp04 = 0b00001011

    val exp08:Byte = 127
    val exp09 = 32767
    val exp10:Short = 32767

    //unsigned : 부호가 없는 정수(음수가 없는 대신 그만큼 양수를 더 표현 가능)
    val uint:UInt = 135u
    val ushort:UShort = 65535u
    val ulong:ULong = 378_274_163_241uL
    val ubyte:UByte = 210u

    //-----실수 자료형
    val exp11 = 3.14
    val exp12 = 3.14F

    val exp13 = 3.14E-2
    val exp14 = 3.14e2

    var num:Double = 0.1

    for(tmp in 1..1000){
        num += 0.1
    }

    println(num)
}