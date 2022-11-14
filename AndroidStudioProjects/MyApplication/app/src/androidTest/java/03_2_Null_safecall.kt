fun main() {
    var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length ?: -1}")
    //세이프 콜과 엘비스 연산자를 사용하면 null인 경우
// 반환 값을 -1과 같은 특정값으로 대체 함으로써 null 발생을
// 7대비할 수 있으므로 안전하고, 코드를 한 줄에 표현할 수 있어 가독성이 좋아집니다.
}