fun retFunc3() {
    println("start of retFunc")
    inlineLambda(13, 3, fun(a,b) { //익명함수
        val result = a + b
        if(result > 10) return
        println("result: $result")

    }) //inlineLambda()함수 끝
    println("end of retFunc")

}