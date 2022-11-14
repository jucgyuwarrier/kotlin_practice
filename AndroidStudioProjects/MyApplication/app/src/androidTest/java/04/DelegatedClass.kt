interface Car2 {
    //클래스의 위임 사용하기 상속과 위임은 다름
    fun go(): String
}
class VanImpl(val power: String): Car2{
    override fun go() = "는 짐을 적재하며 $power 마력을 가집니다."
}
class SportImpl(val power: String): Car2{
    override fun go() = "는 경주용에 사용되며 $power 마력을 가집니다."
}
class CarModel(val model:String, impl:Car2 ): Car2 by impl {
    fun carInfo() {
        println("$model ${go()}")// 참조없이 각 인터페이스의 구현클래스 go에 접근할 수 있음
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100마력"))
    val my350z = CarModel("350Z 2008", SportImpl("350마력"))

    myDamas.carInfo() //carInfo에 대한 다형성을 나타냄
    my350z.carInfo()
}