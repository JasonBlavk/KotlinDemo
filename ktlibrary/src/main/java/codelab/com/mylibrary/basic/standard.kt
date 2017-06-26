package codelab.com.mylibrary.basic

import java.io.File

/**
 * Created by WhiteTec on 2017/6/26.
 *
 * run 、 apply 、 let 、 also 和 with 五个函数均位于 kotlin 包下的 Standard 文件
 * 含义和用法比较相似
 */

class BasicUse{

    val kRun = run {
        //println("Standard ：run")
        return@run "just a run"
    }

    val kAnyRun = "any object before run".run {
        println(this)
        return@run 3
    }

    //返回本身this 在函数范围内，可以任意调用该对象的任意方法，并返回该对象
    val kApply = "before apply".apply {
        //println(this)
        //方法体为空，什么都不做，返回本身this

    }
    //返回本身this
    val kAlso = 2.also {
        //println(it)
        it.and(3)

    }

    val kLet = "before let".let {

        println(it)
        it.replace("before","afer")
        //"after let ..."
    }

    //with函数和前面的几个函数使用方式略有不同，因为它不是以扩展的形式存在的。它是将某对象作为函数的参数，在函数块内可以通过 this 指代该对象。
    // 返回值为函数块的最后一行或指定return表达式。
    val kWith = with(StringBuilder()) {
        //println(this)
        append("with")
        append(true)
        append(1)
//        return@with
    }

    var kRepeat = repeat(3){
        println(it + 1)
    }

    val kTakeif = 5.takeIf {
        it == 0
    }?:"<> 0"

    val isExistDir = File("d:/temp").takeIf {
        it.exists()
    }?:false

}

fun main(args: Array<String>) {
    val basicUse :BasicUse = BasicUse();

    println("================================")

    println(basicUse.kRun)
    println(basicUse.kAnyRun)
    println(basicUse.kApply)
    println(basicUse.kLet)
    println(basicUse.kAlso)
    println(basicUse.kWith)

    println(basicUse.kRepeat)
    println(basicUse.kTakeif)
    println(basicUse.isExistDir)



}
