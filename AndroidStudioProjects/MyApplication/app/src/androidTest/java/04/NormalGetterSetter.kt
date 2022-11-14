class User2(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        //불변형인 val는 getter만 가능
    get() = field

    var name: String = _name
    get() = field
    set(value) {
        field = value
    }

    var age: Int = _age
    get() = field
    set(value) {
        field = value
    }

}

fun main() {
    val user1 = User2(1, "Kildong", 30)
    //user1.id = 2 하면 에러남 val 프로퍼티는 한번 초기화 하면 값변경이 안됨

    user1.age = 35
    println("user1.age = ${user1.age}")
}