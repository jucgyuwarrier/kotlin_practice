//상속 가능한 클래스를 위해 open 사용
open class Bird9(var name: String, var wing: Int, var beak:String, var color: String) {
    fun fly() = println("Fly wing: $wing")
    fun sing(vol:Int) = println("Sing vol: $vol")

}
class Lark(name: String, wing:Int, beak:String, color: String) :Bird9(name, wing, beak, color) {
    fun singHitone() = println("Happy Song!") //새로 추가된 메서드
}
//부 생성자를 사용하는 상속
class Parrot: Bird9 {
    val language: String

    constructor(name: String, wing: Int, beak: String, color: String, language: String) :
            super(name, wing, beak, color) {
        this.language = language
    }

    fun speak() = println("Speak! $language")

}
fun main() {
val coco = Bird9("mybird", 2, "short", "blue")
    val lark = Lark("mylark", 2, "long", "brown")
    val parrot = Parrot("myparrot", 2, "short", "multiple", "korean")
    //프로퍼티 추가

    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Parrot: ${parrot.name}, {${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")

    lark.singHitone()//새로 추가된 메서드가 사용가능함
    parrot.speak()
    lark.fly()


}