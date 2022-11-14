//Any 타입의 사용예시, Any 모든 타입에 사용가능
val data1: Any = 10
val data2: Any = "hello"

//객체형도 Any타입으로 넣을 수 있음
class User
val data3: Any = User()

//unit 타입의 사용예시, Unit 반환문이 없는 함수 자바로 치면 void
val data4:Unit = Unit

fun some1(): Unit {
    println(10 + 20)
}
//반환 타입을 생략하면 알아서 Unit타입이 됨
fun some2() {
    println(10+20)
}

