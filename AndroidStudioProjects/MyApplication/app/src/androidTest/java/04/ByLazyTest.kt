class LazyTest {
    //by lazy로 선언된 프로퍼티의 지연을 초기화 val변수에서만 사용가능함(읽기전용) var는 lateinit
    init {
        println("init block")

    }
    val subject by lazy {
        println("lazy initialized")
        "Kotlin Programming"
    }
    fun flow() {
        println("not initialized")
        println("subject one: $subject") //호출되었음으로 최초로 초기화
        println("subject two: $subject")//위에서 이미 초기화된 값을 재사용
    }
}
fun main() {
    val test = LazyTest()
    test.flow()
}