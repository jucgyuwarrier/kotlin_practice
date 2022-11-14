//다중 상속에 대한 예
interface Bird11 {
    val wings:Int
    fun fly()
    fun jump() = println("bird jump!")
}
interface Horse{
    val maxSpeed: Int
    fun run()
    fun jump() = println("jump!, max speed: $maxSpeed")
}
class Pegasus: Bird11, Horse{
    override val wings:Int = 2
    override val maxSpeed: Int = 100
    override fun fly() = println("Fly!")
    override fun run() = println("Run!")
    override fun jump() {
        super<Horse>.jump()
        println("and jump!")
    }
}
fun main() {
    val pegasus = Pegasus()
    var jump = pegasus.jump()
}