fun main() {

    val num: Any = 256.0f

    if (num is Int) {
        print("Int")
    } else if (num !is Int) {
        print("Not a Int")

    }
}
