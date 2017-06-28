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

}
