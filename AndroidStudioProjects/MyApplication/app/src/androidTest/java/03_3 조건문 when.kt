fun main() {
    var data = 10
    when (data) {
        10 -> println("data is 10")
        20 -> println("data is 20")
        else -> {
            println("data is not valid data")
        }

    }
    var x = 10
    when (x) {
        1 -> print("x==1")
        10 -> print("x==10")
        else -> {//블록 구문 사용 가능}
            print("x는 1, 2가 아닙니다.")

        }
    }
    //인자를 사용하는 when구문(Cont.)
    when(x) {
        0,1 -> print("x==0 or x==1")
        else -> print("기타")
    }

   print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade:Char = 'F'

    when(score) {
        in 90.0 .. 100.0 -> grade = 'A'
        in 80.0 .. 89.9 -> grade ='B'
        in 70.0 .. 79.9 -> grade = 'C'
        !in 70.0 .. 100.0 -> grade = 'F'
    }
    println("Score: $score, Grade: $grade")


    //인자()가 없는 when 실행문예시

    print("Enter the score:")
    var score2 = readLine()!!.toDouble()
    var grade2: Char = 'F'

    //인수 없는 when의 사용
    when {
        score2 >= 90.0 -> grade2 = 'A' //인자가 있는 when과 다르게 조건식을 구성할 수 있음
        score in 80.0 .. 89.9 -> grade2 = 'B'
        score in 70.0 .. 79.9 -> grade2 = 'C'
        score < 70.0 -> grade2 = 'F'
    }
    println("Score2: $score2, Grade2: $grade2")
}