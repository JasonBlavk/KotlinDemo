package benny.unit

/**
 * a_b_c d_e f_g_h
 * a b c d e f g h
 * Created by WhiteTec on 2017/6/29.
 */

fun main(args: Array<String>) {

    //对args里面的每个元素执行lamda(transform)方法，生成的每个元素放到一个集合里面返回

    /**
     * for (element in this) {
        val list = transform(element)
        destination.addAll(list)
      }
     */

    args.flatMap {
        it.split("_")
    }.map {
        print("$it ")
    }


}