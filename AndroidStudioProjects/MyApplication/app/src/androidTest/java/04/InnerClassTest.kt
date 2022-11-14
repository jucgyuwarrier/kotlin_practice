class Smartphone(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size:Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb"
    //이너 클래스의 바깥 클래스의 프로퍼티에 접근
    }
}
fun main() {
    val mySdcard = Smartphone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())
}