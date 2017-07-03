package benny.unit

import com.google.gson.Gson
import java.io.File

/**
 * Created by WhiteTec on 2017/6/30.
 */

fun main(args: Array<String>) {

    val json = "{\"name\":\"jack\",\"id\": 18 }"

    val json1 = File("result.json").readText();

    val result :Singer= Gson().fromJson(json1)

    println(result)
    StaticUtil.sayHello()
}


inline fun <reified T> Gson.fromJson(json: String): T {
    return Gson().fromJson(json,T::class.java)
}

//fun <T> getResult(json: String) :T {
//    return Gson().fromJson(json)
//}




data class Singer(val name:String,val id:Int)