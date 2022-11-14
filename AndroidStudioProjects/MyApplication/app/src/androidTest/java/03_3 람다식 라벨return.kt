fun main() {


    fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
        out(a, b)

    }

    fun reFunc() {
        println("start of retFunc")//람다식 함수명 라벨이름@ {... return@라벨이름
        inlineLambda(13, 3) lit@{ a, b -> val result = a + b //람다식 블록 시작부분에 라벨로 지정
        if(result>10) return@lit //블록 끝부분으로 반환됨
        println("result: $result")
        }

    }
    println("end of retFunc") //이 부분 실행

}