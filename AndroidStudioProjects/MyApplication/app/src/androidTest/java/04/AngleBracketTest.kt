
open class A {
    open fun f() =println("A Class f()")
    fun a() = println("A Class a()")

}

interface B {
    fun f() = println("B Interface f()") //인터페이스는 기본적으로 open
    fun b() = println("B Interface b()")
}
class C : A(), B { //콤마(,)를 사용해 클래스와 인터페이스를 지정함
    //컴파일 하려면 f()를 오버라이딩해야함
    override fun f() = println("C class f()")
    fun test() {
        f()
        b()
        super<A>.f() //A클래스의 f()
        super<B>.f()// B클래스의 f()
    }
}
fun main() {
    val c = C()
    c.test()
}