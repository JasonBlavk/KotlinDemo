package codelab.com.mylibrary.outintest

/**
 * Created by WhiteTec on 2017/6/22.
 */
class Array<T>(val size: Int) {
    fun get(index: Int): T? {
        return null
    }
 fun set(index: Int, value: T) {

 }
}

fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)

//    for (i in from)
//        to[i] = from[i]
}

fun main(args: Array<String>) {
//    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any = Array<Int>(3){1}
//    copy(ints, any) // 错误：期望 (Array<Any>, Array<Any>)
}

fun <T> cloneWhenGreater(list: List<T>, threshold: T): List<T>

        where T : Comparable<Any?>, T : Cloneable {

    return list.filter { it > threshold }
}

fun <T : Comparable<T>> sort(list: List<T>) {

}