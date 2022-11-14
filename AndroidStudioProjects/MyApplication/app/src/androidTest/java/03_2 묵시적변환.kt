fun main() {
    var a: Any =1 //Any형 a는 1로 초기화될때 Int형이 됨
    a = 20L //int형에서 20L로 인해 Long형이 됨
    println("a: $a type: ${a.javaClass}") //a의 자바 기본형을 출력하면 long이 나옴


}
fun main1() {
    checkArg("Hello")
    checkArg(5)
}

fun checkArg(x: Any) {//인자를 Any형으로 받음
    if(x is String) {
        println("x is String: $x")

    }

    if(x is Int) {
        println("x is Int: $x")
    }
}