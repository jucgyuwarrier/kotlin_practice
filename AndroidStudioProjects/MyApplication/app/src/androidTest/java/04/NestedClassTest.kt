class Outer{
    val ov = 5
    class Nested{
        val nv = 10
        fun greeting() = "[Nested] Hello ! $nv" //외부 ov에는 접근못함
    }
    fun outside() {
        val msg = Nested().greeting() //Outer객체 생성 없이 중첩 클래스의 메서드에 접근
        println("[Outer]: $msg, ${Nested().nv}") //중첩 클래스의 프로퍼티에 접근
    }
}
fun main() {
    //static처럼 Outer의 객체 생성 없이 Nested 객체를 생성 사용할 수 있음
    val output = Outer.Nested().greeting()
    println(output)

    //Outer.outside() //에러! Outer객체 생성 필요함
    val outer = Outer()
    outer.outside() }