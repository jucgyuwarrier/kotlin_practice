interface Pet3 {
    var category: String
    val msgTags: String //val 선언시 게터 구현가능
    get() = "I'm your lovely pet!"
    fun feeding()
    fun patting() {
        println("Keep patting!")
    }
}
open class Animal(val name: String)

class Dog(name: String, override var category:String) : Animal(name), Pet3{
    override fun feeding() {
        println("Feed the dog a bone")
    }
}
class Cat7(name: String, override var category: String) : Animal(name), Pet{
    override fun feeding() {
    println("Feed the cat a tuna can!")
}}

class Master {
    fun playWithPet(dog: Dog) {//각 애완동물 종류에 따라 오버로딩됨
    println("Enjoy with my dog.")
}
    fun playWithPet(cat: Cat7) {
        println("Enjoy with my cat.")

    }    }

fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat7("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}