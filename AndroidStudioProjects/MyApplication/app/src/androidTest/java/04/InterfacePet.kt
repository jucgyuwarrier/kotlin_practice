interface Pet {
    var category: String
    //abstract 키워드가 없어도 기본은 추상 프로퍼티
    //마찬가지로 추상 메서드
    fun feeding()
    fun patting() {
        //구현부를 포함하고있으면 일반적인 메서드로 취급해 기본이됨
        println("Keep patting!")
    }
}

class Cat(override var category:String) : Pet {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("small")
    println("Pet Category: ${obj.category}")
    obj.feeding() //구현된 메서드
    obj.patting() //선언부를 포함했던 기본 메서드
}