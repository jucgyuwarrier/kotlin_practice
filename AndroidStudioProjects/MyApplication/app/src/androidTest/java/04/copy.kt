data class Customer2(var name: String, var email: String) {
    var job: String = "Unknown"
    constructor(name: String, email:String, _job:String): this(name, email) {
        job = _job
    }
    init{
        //간단한 로직을 작성가능
    }
}

fun main() {
    val cus1 = Customer2("Sean", "email=sean@mail.com")
    val cus2 = Customer2("Alice", "email=sean@mail.com")
    val cus3 = cus1.copy(name="Alice") //name만 변경하고자 할때

    println(cus1.toString())
    println(cus3.toString())

}