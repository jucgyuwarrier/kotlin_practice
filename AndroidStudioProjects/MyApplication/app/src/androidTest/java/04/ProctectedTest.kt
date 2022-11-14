open class Base2 {
    protected var i = 1
    protected fun protectedFunc() {
        i += 1 //접근 허용
    }
    fun access() {
        protectedFunc() //접근허용
    }
    protected class Nested // 내부클래스에는 지시자 허용
}

class Derived: Base2() {
 fun test(base: Base2): Int {
     protectedFunc() //Base 클래스의 메서드 접근가능
     return i
    }
}
fun main() {
    val base = Base2()
    //접근 안됨 base.i
    //접근 불가 base.protectedFunc()
    base.access()

}