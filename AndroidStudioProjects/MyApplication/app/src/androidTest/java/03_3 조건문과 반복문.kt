fun main() {
    var a = 3
    var b = 4

    var max: Int
    if(a>b)
        max = a
    else
        max = b

    max = if (a>b) a else b

    val c = 12
    val d = 7

    val maxx= if(c>d) {
        println("c선택")
        c
    } else {
        println("d선택")
        d
    }
    println(maxx)

}