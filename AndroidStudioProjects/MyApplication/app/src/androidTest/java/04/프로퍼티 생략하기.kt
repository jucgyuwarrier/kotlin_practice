class Bird8(var name:String, var wing:Int, var beak: String, var color: String) {
    //프로퍼티 위에 var혹은 val로 선언했음으로 프로퍼티가 이미 포함됨

    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird8("bird", 11, "long", "orange")
    //기본값이 있는건 생략하고 없는거만 전달 가능
    println("coco.name: ${coco.name}, coco.wing ${coco.wing}")
    println("coco.color: ${coco.color}, coco.beak ${coco.beak}")


}