package benny.unit

import io.reactivex.Observable
import java.io.File
import java.util.concurrent.Executors

/**
 * Created by WhiteTec on 2017/6/29.
 * 有点问题
 */

fun main(args: Array<String>) {

//    val url = ClassLoader.getSystemResource("/Input")
//    val input = File(ClassLoader.getSystemResource("/Input").path).readText()
    val work = Executors.newCachedThreadPool();
    work.execute {
        println("hello")
    }

    val text = File(ClassLoader.getSystemResource("input").path).readText()
    Observable.fromIterable(text.toCharArray().asIterable()).filter { !it.isWhitespace() }.groupBy { it }.subscribe {
        o -> o.count()
//            .subscribe{
//        println("${o.key} -> $it")
//    }
    }

}