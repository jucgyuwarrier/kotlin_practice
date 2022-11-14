fun main(args: Array<String>) {

    namedParam(x = 200, z = 100)
    //호출할때 선언했던 이름 x,z에 각각 200, 100값을
    // 세팅하고 계산 y는 함수안 기본값 사용


    namedParam(z= 150)
    // z의 이름과 함께 함수 호출(x와 y는 기본값으로 지정함)

    namedParam(z= 100)
}

fun namedParam(x:Int = 100, y: Int = 200, z:Int) { //z값은 따로 지정 안했을때
    println(x + y + z)

}