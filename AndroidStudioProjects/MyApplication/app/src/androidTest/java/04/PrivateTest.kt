private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        println(i)
        i += 1 //접근허용

    }
    fun access() {
        privateFunc()
        println(i)
    }

}

class OtherClass {
   // val opc = PrivateClass() 접근 못함 프로퍼티opc는 private가 되야됨
    fun test() {
        val pc = PrivateClass()
    }
}
fun main() {
    val pc = PrivateClass()
  //  pc.i //접근 불가
  //  pc.privateFunc() // 접근 불가
    pc.access()

}
fun TopFunction() {
    val tpc = PrivateClass()

}