class Bird7 (_name:String, _wing: Int, _beak:String, _color: String) {
    //constructor 생략됨

    //프로퍼티
    var name:String = _name
    var wing: Int = _wing
    var beak: String = _beak
    var color: String = _color

    fun fly() = println("Fly wing: $wing")
    fun sing(vol:Int) = println("Sing vol: $vol")

}

fun main() {
    val coco = Bird7("Youbird", 2, "long", "red")
        //기본값이 있는건 생략하고 없는것만 전달 가능

    println("coco.name:${coco.name}, coco.wing ${coco.wing}")
    println("coco.color:${coco.color}, coco.beak ${coco.beak}")
}