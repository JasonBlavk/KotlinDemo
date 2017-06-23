package codelab.com.bluesea

import kotlin.properties.Delegates

/**
 * Created by WhiteTec on 2017/6/13.
 */
class TestObserve {

    fun main(args: Array<String>) {
//    val b = BaseImpl(10)
//    Derived(b).print() // 输出 10
//
//    println(lazyValue)
//    println(lazyValue)

        val user = User()
        user.name = "first"
        user.name = "second"
        user.age = 13
    }
}

class User {
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
    }

    var age :Int by Delegates.observable(0) {
        property, oldValue, newValue ->

        print("$property -- $oldValue --  $newValue" )
    }
}