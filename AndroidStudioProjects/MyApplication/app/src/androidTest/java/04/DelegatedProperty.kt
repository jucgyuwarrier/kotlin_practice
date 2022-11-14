import kotlin.properties.Delegates

class User5 {
    var name: String by Delegates.observable("NONAME") {
        prop, old, new ->
        println("$old -> $new")
    }

}
fun main() {
    val user = User5()
    user.name="Kildong"
    user.name="Dooly"
}
