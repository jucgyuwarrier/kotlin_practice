class Bird2 {
    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name =name
        this.wing = wing
        this.beak = beak
        this.color = color


    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol:Int) = println("Sing vol: $vol")

}

fun main() {
    val coco = Bird2("mybird", 2, "short", "blue") //생성자의 인자로 객체 생성과 동시에 초기화
    println("coco.color: ${coco.color}")
    coco.fly() //객체의 맴버 메서드 사용
    coco.sing(3)
}