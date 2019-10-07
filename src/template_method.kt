
abstract class AbsRest<T>{
    var mJson:String=""
    protected abstract fun parse(html:String): T
    protected abstract fun getHTML(url:String):String
    protected abstract fun getURL():String


    fun onRespose(res:(t:T)->Unit) {

        mJson = getHTML(getURL())

        var t:T = parse(mJson)

        res(t)
    }
}
object _web{
    fun get(url: String):String{
        return "<html></html>"
    }
}

abstract class AbsGet<T>(url: String): AbsRest<T>(){
    override fun getHTML(url: String): String {
        return _web.get(url)
    }
}
data class Photo(var url:String)

class GetNaver(url:String) : AbsGet<Photo>(url) {
    override fun parse(html: String): Photo {
        return Photo("/image.png")
    }

    override fun getURL(): String {
        return "http://www.naver.com"
    }
}

object TemplateMethodTest {

    @JvmStatic
    fun main(args: Array<String>) {
        GetNaver("url").onRespose{
            refreshUI("print ${it.url}")
        }

    }

    private fun refreshUI(s: String) {
        _log(s)
    }

}


