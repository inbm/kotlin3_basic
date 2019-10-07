
open class Rest


// Unit은 void와 같지만 return을 하지 않아도 된다.
fun Rest.get(callbak: (ret:String)->Unit, url: String){
    _log(url)
    callbak.invoke("get success");
}

fun Rest.post(callbak: (ret:String)->Unit, url: String){
    _log(url)
    callbak("post fail");
}

object CallBackTest {

    @JvmStatic
    fun main(args: Array<String>) {
        Rest().get({ c-> _log(c) }, "naver.com")
        Rest().post({ _log(it) }, "daum.com")
    }

}
