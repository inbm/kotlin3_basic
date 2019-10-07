import kotlinx.coroutines.*

fun hideProgress() {
    _log("hide progress")
}

fun showProgress() {
    _log("show progress")
}

fun Rest.getWithCoroutine(callbak: (ret:Int)->Unit, url: String){
    var data = 0;
    GlobalScope.launch {
        showProgress()

        async (Dispatchers.Default){
            for(i in 1..100){
                data += i
                _log(i)
                Thread.sleep(10L)

            }
        }.await()

        callbak.invoke(data);

        hideProgress()
    }

}

// https://tourspace.tistory.com/150?category=797357
object CoroutineTest {

    @JvmStatic
    fun main(args: Array<String>) {

        Rest().getWithCoroutine({
            updateUI(it)
        }, "naver.com")

        Thread.sleep(2000L)
        _log("end")
    }

    private fun updateUI(i: Int) {
        _log("display in textview with $i")
    }


}
