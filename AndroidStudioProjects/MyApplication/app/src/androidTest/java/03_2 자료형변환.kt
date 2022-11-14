val a: Int = 1
//val b: Double = a
//자료형의 불일치로 오류가 발생
//val c: Int = 1.1
//자료형의 불일치로 오류가 발생함 변환 메서드를 활용해야함

val b: Double = a.toDouble()//변환 메서드
//자료형의 자동 변환
val result = 1L + 3