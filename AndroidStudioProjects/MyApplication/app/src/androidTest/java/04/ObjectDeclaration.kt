object OCustomer {
    var name = "kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")
    init{
        println("Init!")

    }
}
class Hobby(val name: String)
fun main() {
    OCustomer.greeting()
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)
}