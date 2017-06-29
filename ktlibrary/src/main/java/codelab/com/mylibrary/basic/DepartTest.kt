package codelab.com.mylibrary.basic

/**
 * Created by WhiteTec on 2017/6/28.
 */


/**
 * 让我们假设我们需要从一个函数返回两个东西。例如，一个结果对象和一个某种状态。 在 Kotlin 中一个简洁的实现方式是声明一个数据类并返回其实例：
 *
 */
data class Result(val result: String, val status: Int)

fun function(): Result {
    // 各种计算
    return Result("Test", 1)
}


fun pairfun(int:Int, str : String) :Pair<Int,String>{

    return Pair(int,str.toUpperCase())
}

private fun mapfun() {
    val map = hashMapOf("foo" to 1, "bar" to 2)

    for ((a, b) in map) {

        println("key $a  value $b")
    }

    val map1 = map.mapValues {

        (_, value): Map.Entry<String,Int> -> " $value !"
//        (_, value: Int) -> "$value!"
    }

    println(map1)

    val map2 = map.mapKeys {
        (key, value) -> "$value!"
    }
    println(map2)


}


// 现在，使用该函数：
fun main(args: Array<String>) {
    val (result, _) = function()

    println(result)

    println(function().component2())


    println(pairfun(18,"Kotlin").component1())
    println(pairfun(18,"Kotlin").second)

    mapfun()

}
