package codelab.com.mylibrary.function

import android.content.Context
import android.util.TypedValue
import android.view.View

/**
 * Created by WhiteTec on 2017/5/22.
 */

var View.Tag :Int
    set(value) {

    }
    get() = 1

var View.padLeft: Int
    set(value) {
        setPadding(value, paddingTop, paddingRight, paddingBottom)
    }

    get() {
        return paddingLeft
    }




fun Context.popStick(){

}
fun sum(a: String, b: Int) {

    a + b
    val aInt: Int? = a as? Int

}

fun printSum(a: Int, b: Int) {
    print(max(a, b))
}


fun main1(args: Array<String>) {
    var a = 4;
    a = 5;

    if (args.size == 0) return
    print("First argument: ${args[0]}")

}

fun max(a: Int, b: Int) = if (a > b) a else b

val a = 3
var b = "sdf"

fun parseInt(str: String): Int? {

    val nullableList: List<Int?> = listOf(1, 2, null, 4)

    val intList: List<Int> = nullableList.filterNotNull()

    val listWithNulls: List<String?> = listOf("A", null, "test")

    for (item in listWithNulls) {
        item?.let {
            println(item)
        }
    }

    return null
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // 在这个分支中, `obj` 的类型会被自动转换为 `String`
        return obj.length
    }

    // 在类型检查所影响的分支之外, `obj` 的类型仍然是 `Any`
    return null
}

fun boxer () {
    val a: Int = 10000
    print(a === a) // 打印结果为 'true'

    val boxedA: Int = a
    val anotherBoxedA: Int? = a
    print(boxedA == anotherBoxedA)

    boxedA.equals(anotherBoxedA)


    boxedA.toLong()


}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'X')
        throw IllegalArgumentException("Out of range")
    return c.toInt() // 显式转换为数值
}

fun test (xx :(Int)) {

}

/*
 * 程序入口
 */
fun main(args: Array<String>) {
//    parseInt("1")
//    boxer()

    val a = 10
    val b = 20
    val max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
    args.forEach {
        if (it.toInt() == 0) return
        print(it)
    }


    print(max)

    print(max+1)
    val char:Char = 'A'
    print(char.toInt())
    print(decimalDigitValue(char))


    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin("> ")

    val s = "abc"
    val str = "$s.length is ${s.length}"

    val price = """
        ${"$"}9.99
        """

    print(text)

    val asc = Array(5, { i -> Human(i) })

    print(asc)
//
//    for (i in args.indices) {
//        print(args[i])
//    }
//



//    fun cases(obj: Any) {
//        when (obj) {
//            2 -> parseInt(obj? String
//                ) obj
//            else "sre")
//                1
//            -> print("One")
//            "Hello" -> print("Greeting")
//            is Long -> print("Long")
//            !is String -> print("Not a string")
//            else -> print("Unknown")
//        }
//    }


}

fun View.dp_f(dp: Float): Float {
    // 引用View的context
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.resources.displayMetrics)
}

// 转换Int
fun View.dp_i(dp: Float): Int {
    return dp_f(dp).toInt()
}