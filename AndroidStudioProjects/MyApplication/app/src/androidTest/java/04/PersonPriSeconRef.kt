class Person2(firstName: String,
out: Unit = println("[Primary Constructor] Parameter")) { //주 생성자

    val fName=println("[Property] Person fName: $firstName") //프로퍼티 할당

    init {
        println("[init] Person init block") //초기화 블록
    }

    constructor(firstName: String, age: Int, out: Unit = println("[Secondary Constructor] Parameter"))
    : this(firstName) {
        println("[Secondary Constructor] Body: $firstName, $age")
    }


}
fun main() {
    val p1 = Person2("Kildong", 30) //호출 순서 주의
    println()
    val p2 = Person2("Dooly")

}