package codelab.com.bluesea

/**
 * Created by WhiteTec on 2017/6/13.
 */
interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

class Derived(b: Base) : Base by b {
    override fun print() {
        print("adc")
    }
}

fun isOdd(x: Int) = x % 2 != 0
fun isOdd(s: String) = s == "brillig" || s == "slithy" || s == "tove"

val filter: (Int) -> Boolean = { isOdd(it) }

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).print() // 输出 10
//
//    println(lazyValue)
//    println(lazyValue)

    val user = User()
    user.name = "first"
    user.name = "second"
    user.age = 13

    val numbers = listOf("1", "2", "3")
    val numbers1 = listOf(1, 2, 4)

    println(numbers1.filter(filter))

    println(getDtr("ste", String::toCharArray)[2])
    println(::x)


    val strs = listOf("a", "bc", "def")

    val len = strs.fold("") {
        acc, it ->
        acc + it
    }

    val b1 = strs.let {

    }.let {

    }
    println(strs.map(::test))

}

fun test(s: String?): Int {
    s?:return 0

    return s.length
}


var x = 1

fun getDtr(str: String, body: String.() -> CharArray): CharArray {
    return body(str)
}
//class Delegate {
//    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
//        return "$thisRef, thank you for delegating '${property.name}' to me!"
//    }
//
//    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
//        println("$value has been assigned to '${property.name} in $thisRef.'")
//    }
//}

val lazyValue: String by lazy(LazyThreadSafetyMode.NONE) {
    println("computed!")
    "Hello"
}

//class User {
//    var name: String by Delegates.observable("<no name>") {
//        prop, old, new ->
//        println("$old -> $new")
//    }
//
//    var age :Int by Delegates.observable(0) {
//        property, oldValue, newValue ->
//
//        print("$property -- $oldValue --  $newValue" )
//    }
//}