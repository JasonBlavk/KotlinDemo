package codelab.com.mylibrary.function

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Created by WhiteTec on 2017/5/31.
 */

interface Base1 {
    fun print()
}

class BaseImpl(val x: Int) : Base1 {
    override fun print() { print(x) }
}

class BaseDe(b: Base1) : Base1 by b

//fun main(args: Array<String>) {
//    val b = BaseImpl(10)
//    BaseDe(b).print() // 输出 10
//}

class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}

val lazyValue1: String by lazy {
    println("computed!")
    "Hello"

}

//fun main(args: Array<String>) {
//    println(lazyValue1)
//    println(lazyValue1)
//}

var name1: String by Delegates.observable("wang", {
    kProperty, oldName, newName ->
    println("kProperty：${kProperty.name} | oldName:$oldName | newName:$newName")
})


//fun main(args: Array<String>) {
//
//    println("name: $name1") // Log：nam：wang
//
//    name1 = "zhang" // Log：kProperty：name | oldName:wang | newName:zhang
//
//    name1 = "li" // Log：kProperty：name | oldName:zhang | newName:li
//}

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

class Person2(var name: String, var age: Int) {

    // 使用infix 关键字标记，该函数可被中缀标记法法调用
    infix fun printName(addr: String) {
        println("addr: $addr, name: $name")
    }
}

fun main(args: Array<String>) {
    val person: Person2 = Person2("get", 20)

// 使用中缀标记法调用扩展函数
    person printName "AA-BB" // Log: addr: AA-BB, name: Jone

// 上面的语句等价于
    person.printName("AA-BB")
}

fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
    val result = arrayListOf<R>()

    for (item in this)
        result.add(transform(item))
    return result
}

fun<String> getTime() {


}