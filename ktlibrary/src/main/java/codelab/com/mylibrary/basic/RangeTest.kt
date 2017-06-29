package codelab.com.mylibrary.basic

/**
 * Created by WhiteTec on 2017/6/28.
 */

/**
    区间表达式由具有操作符形式 .. 的 rangeTo 函数辅以 in 和 !in 形成。 区间是为任何可比较类型定义的，但对于整型原生类型，它有一个优化的实现。以下是使用区间的一些示例

    if (i in 1..10) { // 等同于 1 <= i && i <= 10
    println(i)
    }
    整型区间（IntRange、 LongRange、 CharRange）有一个额外的特性：它们可以迭代。 编译器负责将其转换为类似 Java 的基于索引的 for-循环而无额外开销。

    for (i in 1..4) print(i) // 输出“1234”

    for (i in 4..1) print(i) // 什么都不输出
    如果你想倒序迭代数字呢？也很简单。你可以使用标准库中定义的 downTo() 函数

    for (i in 4 downTo 1) print(i) // 输出“4321”
    能否以不等于 1 的任意步长迭代数字？ 当然没问题， step() 函数有助于此

    for (i in 1..4 step 2) print(i) // 输出“13”

    for (i in 4 downTo 1 step 2) print(i) // 输出“42”
    要创建一个不包括其结束元素的区间，可以使用 until 函数：

    for (i in 1 until 10) {   // i in [1, 10) 排除了 10
    println(i)
    }
 */

fun main(args: Array<String>) {

    println((1..12 step 12).last)
    smartConvert("test")

}

// 只能转换
fun smartConvert(x: Any) {

    // `||` 右侧的 x 自动转换为字符串
    if (x !is String || x.length == 0)
        return
    println(x.length)


    if (x is String) {
        println(x.length) // x 自动转换为字符串
    } else {
        println("not a string")
    }

    //“不安全的”转换操作符

    var y = null
    val x: String? = y as? String
    println(x)

    // this 用法
//    A().B().foo()

    val listWithNulls: List<String?> = listOf("A", null)
    for (item in listWithNulls) {
        item?.let {
            println(it)
        } // 输出 A 并忽略 null
    }

    //Elvis 操作符 elvis 操作符就返回其左侧表达式，否则返回右侧表达式。
    // 请注意，当且仅当左侧为空时，才会对右侧表达式求值。
    val elvis = x?.length ?: -1
    println("elvis = $elvis")


    //!! 操作符 如果 b 为空，就会抛出一个 NPE 异常 KotlinNullPointerException
    val str : String? = null
    val l = str!!.length
    println(l)

    //安全的类型转换 as?
    val aInt: Int? = str as? Int

    println("安全的类型转换 as? $aInt")

    // 类引用 函数引用 ::
    fun isOdd(x: Int) = x % 2 != 0
    fun isOdd(s: String) = s == "brillig" || s == "slithy" || s == "tove"

    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd))

}


class A { // 隐式标签 @A
     inner class B { // 隐式标签 @B
        fun foo() { // 隐式标签 @foo
            val a = this@A // A 的 this
            val b = this@B // B 的 this

            val c = this // foo() 的接收者，一个 Int
            val c1 = this // foo() 的接收者，一个 Int

            val funLit = lambda@ fun String.() {
                val d = this@B // funLit 的接收者
                println(d)
            }

            val funLit2 = { s: String ->
                // foo() 的接收者，因为它包含的 lambda 表达式
                // 没有任何接收者
                val d1 = this
                println(d1)
            }

        }

    }
}