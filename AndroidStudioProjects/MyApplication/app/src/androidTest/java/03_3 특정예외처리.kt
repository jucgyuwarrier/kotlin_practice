import java.lang.ArithmeticException

fun main() {
     val a = 6
     val b = 0
     val c :Int
     try {
         c=a/b //0으로 나눔
     }catch(e:ArithmeticException) {
         println("Exception is handled. ${e.message}")//Exception is handled. / by zero
     }
    // catch(e : Exception){e.printlnStackTrace()}
    //오류가 있는 구문을 추척함

 }
