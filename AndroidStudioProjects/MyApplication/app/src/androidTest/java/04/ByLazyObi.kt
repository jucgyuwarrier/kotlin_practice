class Person4(val name: String, val age: Int)
//by lazy를 통한 val변수 지연 초기화

fun main() {
    var isPersonInstantiated: Boolean = false //초기화 확인 용도
    val person: Person4 by lazy { //lazy를 통한 person 객체의 지연 초기화}
        isPersonInstantiated = true
        Person4("Kim", 23)
    }//val person 끝
    val personDelegate = lazy {Person4("Hong", 40)}
    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}")
    println("personDelegate.value.name = ${personDelegate.value.name}")

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

}