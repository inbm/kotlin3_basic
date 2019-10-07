/*
    singleton..
*/

object Singleton{
    init {
        _log("once")
    }
    fun run() = "---";
}

object SingletonTest {

    @JvmStatic
    fun main(args: Array<String>) {
        Singleton.run()
    }
}