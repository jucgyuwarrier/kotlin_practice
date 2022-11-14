fun print3Numbers(num1: Int, num2: Int, num3: Int) {
    //num1, 2, 3을 각각 출력


}
fun print4Numbers(num1: Int, num2: Int, num3: Int, num4: Int) {
    //num1, 2, 3, 4를 각각 출력
}

fun main(args: Array<String>) {
    normalVarargs(1,2,3,4) //4개로 인자를 구성
    normalVarargs(4,5,6) //3개로 인자를 구성
}

fun normalVarargs(vararg counts: Int) {
    for(num in counts) {
        println("$num")
    }
    print("\n")//줄바꿈

}