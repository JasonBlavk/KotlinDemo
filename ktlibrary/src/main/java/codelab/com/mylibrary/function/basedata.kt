package codelab.com.mylibrary.function

/**
 * Created by WhiteTec on 2017/5/27.
 */


open class BaseData {
    val code: Int? = 0
    val status: String = "success"
}

class  test : BaseData(){

}
data class LoginApiData constructor(val name: String) : BaseData() {

}

fun main(args: Array<String>) {
    LoginApiData("").copy("");

    val data = LoginApiData("time")

    data.component1()

    val (name) = data
    //println("$name, $age years of age")
}

class Person1(val firstName: String, val lastName: String, var age: Int) {

}

open class A1 {
    open fun foo(i: Int = 10) {

    }
}

class B1 : A1() {
    override fun foo(i: Int) {

    }  // 这里不允许指定默认参数值
}

class Outer1 {
    private val bar: Int = 1
    inner class Nested {
        fun foo() = 2

        val Bar = bar
    }
}

class C11 {
    // 私有函数，所以其返回类型是匿名对象类型
    private fun foo() = object {
        val x: String = "x"
    }

    // 公有函数，所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x      // 没问题
        val x2 = publicFoo()  // 错误：未能解析的引用“x”
    }
}