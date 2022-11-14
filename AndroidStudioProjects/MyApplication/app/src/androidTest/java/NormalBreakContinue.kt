package  chap04.section3

fun main() {
    for(i in 1..5) {
        if(i==3) break//가장 가까운 반복문을 빠져나감
        println(i)
    }
    println()
    println("outside")

}

fun labelBreak() {
    println("labelBreak")
    for(i in 1..5) {
        second@for(j in 1..5) {
            if(j == 3) break
            println("i:$i, j:$j")

        }
        println("after for j")
    }
    println("after for i")

}
//라벨없는 break와 라벨이 있는 break


