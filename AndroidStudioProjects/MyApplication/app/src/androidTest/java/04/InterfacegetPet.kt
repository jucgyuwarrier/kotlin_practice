interface Pet2 {
    var category: String
    val msgTags:String //val선언 시 게터의 구현이 가능해짐
    get() = "I'm your lovely pet!"

    fun feeding()
    fun patting() {
        println("Keep patting!")
    }
}

class Cat2(override var category: String) : Pet2 {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat2("small")
    println("Pet Message Tags: ${obj.msgTags}")
    obj.feeding()
    obj.patting()
}