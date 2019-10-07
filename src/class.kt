


// 상속시  open 키워드.
open class Person(var id:Int, var name: String)

// data keywork
data class Employee(val id: Int, var name: String)

class Family: Person(100, "person") {
    fun desc(){
        _log("$id, $name")
    }
}

object ClassBasic {

    @JvmStatic
    fun main(args: Array<String>) {
        // write your code here
        val person = Person(10, "inbm")
        val e1 = Employee(20, "lee")

        // data 클래스이므로 copy가 가능.
        val e2 = e1.copy()
        e2.name = "park"

        _log("${person.name}, ${e1.name}, ${e2.name}")

        val family = Family()
        family.desc()
    }

}
