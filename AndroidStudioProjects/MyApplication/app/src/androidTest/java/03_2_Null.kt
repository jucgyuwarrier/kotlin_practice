fun main() {
    var str1 : String = "Hello kotlin"
    //str1 = null
    //null을 허용하지 않음(오류 발생)
    println("str1: $str1")

    var str2 : String? = null
    //: 타입뒤에 ?를 붙여줘야 null값을 사용할 수 있음
    println("str2: $str2")

    var str3 : String? = "Hello kotlin"
    // ?를 붙이면 나중에도 null값으로 변경 가능
    str3 = null
    val len = if(str3 != null) str3.length else -1
    println("str3: $str3 length: ${len}")
    //null이 됬기때문에 -1을 반환함
}
