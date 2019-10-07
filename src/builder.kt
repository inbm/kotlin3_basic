/*
    singleton..
*/

class FoodOrder(
        val bread: String?,
        val condiments: String?,
        val meat: String?,
        val fish: String?) {

    class Builder(
            var bread: String? = null,
            var condiments: String? = null,
            var meat: String? = null,
            var fish: String? = null) {

        fun bread(bread: String) =  apply { this.bread = bread }
        fun condiments(condiments: String) = apply { this.condiments = condiments }
        fun meat(meat: String) = apply { this.meat = meat }
        fun fish(fish: String) = apply { this.fish = fish }
        fun build() = FoodOrder(bread, condiments, meat, fish)
    }

    override fun toString(): String {
        return "$bread $condiments $meat $fish"
    }
}

object BuilderTest {

    @JvmStatic
    fun main(args: Array<String>) {
        val order = FoodOrder.Builder().bread("backet")
                .fish("nimo")
                .meat("lamb")
                .build()
        _log(order.toString())
    }
}