fun main() {
    val name= "홍길동"
    val email = "hong@example.kr"

    add(name)
    add(name, email)
    add("둘리", "dooly@example.kr")
    defaultArgs() // 아무 값도 안넣으면 아래 defaultArgs 함수 안에 기본값이 자동으로 들어감
    defaultArgs(200) // 아래 defaultArgs의 첫번째 매개변수 x에만 200이 세팅되고 y는 기본값 사용
}

fun add(name: String, email: String = "default") {
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x:Int = 100, y:Int = 200) {
    println(x + y)

}

