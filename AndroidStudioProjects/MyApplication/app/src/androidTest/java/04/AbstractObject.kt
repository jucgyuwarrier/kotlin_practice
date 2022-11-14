//단일 인스턴스로 객체를 생성
//object를 사용한 생성
abstract class Printer {
    abstract fun print() //추상 메서드
}

val myPrinter = object: Printer() { //객체 인스턴스
    override fun print() {//추상 메서드 구현
        println("출력합니다.")
    }
}

fun main() {
    myPrinter.print()
}