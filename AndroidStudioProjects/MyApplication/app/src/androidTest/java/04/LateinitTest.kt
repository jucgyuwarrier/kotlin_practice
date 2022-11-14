class Person3{
    lateinit var name: String //늦은 초기화를 위한 선언

    fun test() {

        if(!::name.isInitialized) {//프로퍼티의 초기화 여부 판단
            println("not initialized")
    } else {
        println("initialized")
    }
    }

}

fun main() {
    val kildong = Person3()
    kildong.test()
    //초기화가 안되서 not initialized뜸
    kildong.name="kildong" //lateinit을 걸어놓은 name프로퍼티를 호출한 이 시점에서 초기화됨
    //원래는 클래스 생성자의 생성과 동시에 그안 프로퍼티들도 초기화
    kildong.test()
    println("name = ${kildong.name}")
}