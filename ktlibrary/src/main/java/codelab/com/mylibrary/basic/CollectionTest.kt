package codelab.com.mylibrary.basic

/**
 * Created by WhiteTec on 2017/6/27.
 */


fun main(args: Array<String>) {
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    val readOnlyView: List<Int> = numbers

    println(numbers)        // 输出 "[1, 2, 3]"
    numbers.add(4)
    println(readOnlyView)   // 输出 "[1, 2, 3, 4]"
//    readOnlyView.clear()    // -> 不能编译

    val strings = hashSetOf("a", "b", "c", "c")
    assert(strings.size == 3)


    val maps = mapOf(1 to 2,3 to 3)

    println(maps)

    val list: List<Int> = listOf(1, 2, 3)

    val test = with(listOf(1,2,4)){
        println(this.size)

        if (this is List){

            when(this.size){
                0 ->  println("test size 0 ")
                else ->  println("test size== $this.size")
            }
        }else{
            println("not a list")
        }
    }

    println(test)

    var items = mutableListOf(1, 2, 3, 4)
    items.first() == 1
    items.last() == 4
    println(items.filter { it % 2 == 0 })   // 返回 [2, 4]


    for ( i in items) {

        println(i ) // 5 2 3 4
    }

//    for ( i in 0 .. items.size){
//        println(i)
//        items[i]++
//        println(items)
//    }
//
    run {
        println(items.forEach {

            if (it > 2)
            //foreach内部for循环 不受action行为的影响。
                return@run

            println(it)

        })
    }

    run outside@ {
        (0..20).forEach inside@ {
            if (it > 10) return@outside
            println(it)
        }
    }

    //下面这是continue，运行结果就是continue的效果。
    run breaking@ {
        (0..20).forEach continuing@ {
            print(it)
            if (10 <= it) return@continuing
            println(it)
        }
    }


//    println(items)



    val rwList = mutableListOf(1, 2, null)
//    println(rwList.requireNoNulls())
//    Pair(1, 10).forEach(::println)

}
private val _items = mutableListOf<String>()
val items: List<String> get() = _items.toList()

fun Pair<Int, Int>.forEach(block: (Int) -> Unit) {
    for (i in first..second) block.invoke(i)
}