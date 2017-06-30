package benny.unit

/**
 * Created by WhiteTec on 2017/6/29.
 */

//val 的参数定义 为属性，不带的话 就是普通参数
enum class Lang(val hello: String /*,city :String*/) {
    ENGLISH("hello"),
    CHINESE("你好"),
    JAPANESE("もしもし"),
    KOREAN("안녕하세요.");

    fun sayHello(){
        //println(city) 这里不可以
        println(hello)

    }

    init {
//        println(hello)
        //println(city)这里可以访问 参数city
    }

    /**
     * 伴生对象 只对应一个类，可通过类 直接调用
     *
     * 类似java里面的 静态方法 变量 常量等
     */
    companion object{
        var change: Int = 1
        val roll = false

        fun parse(name :String) : Lang{
            return Lang.valueOf(name.toUpperCase())
        }
    }
}

fun main(args: Array<String>) {
    if (args.size == 0 ) return
    val lang = Lang.parse(args[0])
    println(lang)
    lang.sayHello()
    lang.sayBye()

    Lang.change
    Lang.roll
}

fun Lang.sayBye(){

    val bye = when(this){
        Lang.ENGLISH ->  "bye"
        Lang.CHINESE -> "再见"
        Lang.JAPANESE -> "さようなら"
        Lang.KOREAN -> "안녕히 계세요"
    }
    println(bye)
}
