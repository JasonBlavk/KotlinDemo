package codelab.com.mylibrary.function

/**
 * Created by WhiteTec on 2017/5/27.
 */

open class Ext

class De: Ext()

fun Ext.foo() = "c"

fun De.foo() = "d"

fun printFoo(c: Ext) {
    println(c.foo())
}


fun main(args: Array<String>) {
    printFoo(De())
    MyClass.create()
}

class MyClass {

    companion object test {
        fun create(): MyClass = MyClass()
    }
}