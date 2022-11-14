class Bird {
    var name: String = "mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol") }

fun main() {
    val coco = Bird() //클래스의 생성자를 통해 객체를 생성함
    coco.color = "red"

    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}
