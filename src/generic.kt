// 클래스 generic.
class Box<T>(t: T) {
    var width = t
}

class Car(var carName:String)

// interface generic
interface Container<T>{
    fun put(item:T)
    fun take():T
}

class Garage:Container<Car>{
    lateinit var car:Car

    override fun put(item: Car) {
        this.car = item
    }

    override fun take(): Car {
        return car
    }

}

// 함수 제너릭
fun <T> printList(items: List<Car>){
    for (item in items){
        _log(item)
    }
}

object GenericTest {

    @JvmStatic
    fun main(args: Array<String>) {
        var box = Box<String>("100")
        _log(box.width)

        val garage = Garage()
        garage.put(Car("pony"))
        garage.take()

        printList<Car>(listOf(
                Car("a"),
                Car("b")
        ))
    }

}
