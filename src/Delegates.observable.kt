import kotlin.properties.Delegates

/*
    let, apply, run, with
*/


class User4Observable {
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        _log(prop.toString())
        _log("$old -> $new")
    }
}

object ByObservable {

    @JvmStatic
    fun main(args: Array<String>) {

        println(lazyValue)
        println(lazyValue)


        val user = User4Observable()
        user.name = "aaa"
        user.name = "bbb"

    }
}


val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}