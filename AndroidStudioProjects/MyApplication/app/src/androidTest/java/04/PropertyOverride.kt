open class First {
open val x : Int = 0 //요소에 open이 있으면 클래스에도 open을 붙여줘야 오버라이딩 가능
    get() {
        println("First x")
        return field
    }
    val y: Int = 0 //open 키워드가 없으면 자동으로 final 프로퍼티임
}

class Second: First() {
    override val x: Int = 0
    get() {
        println("Second x")
        return field + 3
    }
    //override val y: Int = 0 에러나서 안됨

}
fun main() {
    val second = Second()
    println(second.x)
    println(second.y)
}