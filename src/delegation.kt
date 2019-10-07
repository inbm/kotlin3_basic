/*
    delegation..
*/

interface Printable {
    var message:String
    fun print()
    fun turnOn()
}

class Monitor(val s: String) : Printable {
    override var message: String = "I'm monitor"


    override fun turnOn() {
        _log("monitor on")
    }

    override fun print() {
        _log("small $s")
    }


}



class Derived(device: Printable) : Printable by device{
    override var message: String = "I'm derived"

    override fun print() {
        _log("overrided print()")
    }
}


object DelegationTest {

    @JvmStatic
    fun main(args: Array<String>) {

        val monitor = Monitor("to monitor")
        Derived(monitor).turnOn() // monitor on
        Derived(monitor).print() // overrided print()
        _log(monitor.message) // I'm monitor

    }
}