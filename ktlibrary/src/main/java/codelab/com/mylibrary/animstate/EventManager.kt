package codelab.com.mylibrary.animstate

import java.util.*

/**
 * Created by WhiteTec on 2017/6/22.
 */
object EventManager {

    @JvmStatic val mOnAnimationStateListener: ArrayList<OnAnimStateListener> by lazy {
        arrayListOf<OnAnimStateListener>()
    }

    @JvmStatic inline fun onFold(eventId: Int, eventName: String, trackIndex: Int, loopCount: Int, operation: OnAnimStateListener.(id: Int, eventName: String, trackIndex: Int, loopCount: Int) -> Boolean): Boolean {

        return mOnAnimationStateListener.fold(false) { acc, listener -> operation.invoke(listener, eventId, eventName, trackIndex, loopCount) || acc }
    }

    fun isOdd(x: Int) = x % 2 != 0

    fun isOdd(s: String) = s == "brillig" || s == "slithy" || s == "tove"

    @JvmStatic
    fun main(args: Array<String>) {

        val numbers = listOf(1, 2, 3)
        println(numbers.filter(EventManager::isOdd))

        val predicate: (String) -> Boolean = EventManager::isOdd   // 引用到 isOdd(x: String)

        val strs = listOf("a", "bc", "def")
        println(strs.map(String::chars)) // 输出 [1, 2, 3]


        val t1 = TypedClass("Hello World!")
        val t2 = TypedClass(25)

    }


    class TypedClass<T:Any>(parameter: T) {
        val value: T = parameter
    }
}
