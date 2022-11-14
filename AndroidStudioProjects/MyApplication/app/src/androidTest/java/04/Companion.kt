class Outer1 {
    class Nested1{
        fun accessOuter() {
            println(country)
            getSomething()
        }
    }
    companion object {
        const val country = "Korea"
        fun getSomething() = println("Get something...")
    }
}
