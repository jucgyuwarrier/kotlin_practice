internal class InternalClass {
    internal var i = 1
    internal fun icFunc() {
        i += 1
    }
    fun access() {
        icFunc()
    }

}
class Other {
    internal val ic = InternalClass() //프로퍼티(필드)지정시 internal로 맞춰줘야됨
    fun test() {
        ic.i
        ic.icFunc() //접근 허용

    }
}
fun main() {
    val mic = InternalClass() //생성 가능
    mic.i //접근 허용
    mic.icFunc() //접근허용
}
