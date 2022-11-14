data class Customer(var name: String, var email: String) {
    var job: String = "Unknown"
    constructor(name: String, email:String, _job: String): this(name, email) {
        job = _job
    }
    init {
        //간단한 로직 작성
    }
}

fun main() {
    val cus1 = Customer("Sean", "sean@mail.com")
    val cus2 = Customer("Sean", "sean@mail.com")

    println(cus1 == cus2)
    println(cus1.equals(cus2))
    println("${cus1.hashCode()}, ${cus2.hashCode()}")//고유값도 동일
}

