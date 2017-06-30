package benny.unit

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * Created by WhiteTec on 2017/6/29.
 * api访问不了
 */



data class User(val login:String, val avator:String){
    override fun toString(): String {
        return super.toString()
    }
}

interface GithubS{

    @GET("/enbandari/Kotlin-Tutorials/stargazers")
    fun getStargazer():Call<List<User>>
}
object ServiceGetStar{

    val getService:GithubS by lazy {

        Retrofit.Builder().baseUrl("https://api.github.com").addConverterFactory(GsonConverterFactory.create()).build().create(GithubS::class.java)
    }
}

fun main(args: Array<String>) {
    ServiceGetStar.getService.getStargazer().execute().body().map(::println)
}