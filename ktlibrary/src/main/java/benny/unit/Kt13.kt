package benny.unit

import android.app.Activity
import android.os.Bundle
import codelab.com.mylibrary.R

/**
 * Created by WhiteTec on 2017/6/30.
 *
 *
 * kapt annotation process tools
 *
 * 编译java代码之前 要处理注解，生成一些代码
 *
 *
 */

class KButterActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

    }
}

object StaticUtil{
    fun sayHello(){
        println("hello")
    }
}