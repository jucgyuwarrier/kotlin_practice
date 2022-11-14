
//일반적인 함수
fun sum1(a:Int, b:Int): Int {
    return a + b
}

//간략화된 함수
fun sum2(a: Int, b: Int): Int = a + b

//반환 자료형 생략 :Int
fun sum3(a: Int, b: Int) = a + b

fun sum4(a: Int, b:Int): Int {
    var sum = a + b
    return sum
}

fun main(){

    val result1 :Int = sum2(3, 2)
    val result2 :Int = sum2(6, 7)

    println(result1)
    println(result2)

}