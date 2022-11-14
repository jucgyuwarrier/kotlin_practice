fun main() {
    val number = 0
    val result = if(number > 0)
        "양수값"
     else if (number <0)
         "음수값"
    else
        "0"

    print("Enter the score: ")
    val score = readLine()!!.toDouble() //콘솔로부터 입력받음
    var grade = 'A'
    if(score >= 90.0) {
        grade = 'A'
} else if (score >= 80.0 && score <= 89.9) {
    grade = 'B'
} else if (score >= 70.0 && score <= 79.9) {
    grade = 'C'
}
println("Score : $score, Grade: $grade")
}