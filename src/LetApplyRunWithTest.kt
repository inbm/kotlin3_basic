/*
    let, apply, run, with
*/

class Todo(var work:String="", var id:Int=0, var detail:String="")

object LetApplyRunWithTest {

    @JvmStatic
    fun main(args: Array<String>) {
        var todo = Todo().apply {
            id = 20
            detail = "4 time"
        }

        todo.let { _log(it.detail) }

        todo.run {
            id = 100
            work = "coding"
            detail = "tree times"

        }

        todo.let {
            _log(it.detail)
        }

        todo.let { with(it){

            _log("${id}, ${work}, ${detail}")
        } }


    }
}