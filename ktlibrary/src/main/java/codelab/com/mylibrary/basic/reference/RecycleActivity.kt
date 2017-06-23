package codelab.com.mylibrary.basic.reference

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import codelab.com.mylibrary.R
import kotlinx.android.synthetic.main.recyle_layout.*

/**
 * Created by WhiteTec on 2017/5/18.
 * 启动RecycleActivity：
 * startActivity(Intent(MainActivity@this, RecycleActivity::class.java))
 */

class RecycleActivity : Activity() {

    private val items = listOf("Kotlin DEMO数据1",
            "Kotlin DEMO数据21/8", "Kotlin DEMO数据17",
            "Kotlin DEMO数据111", "Kotlin DEMO数据1",
            "Kotlin DEMO数据1", "Kotlin DEMO数据17")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyle_layout)

        recycle_view1.layoutManager = LinearLayoutManager(this)

        //Java版本adapter
        recycle_view1.adapter = JRecycleAdapter(items)

        //kotlin版本adapter
        recycle_view1.adapter = RecycleAdapter(items = listOf("Kotlin DEMO数据1",
                "Kotlin DEMO数据218", "Kotlin DEMO数据17",
                "Kotlin DEMO数据111", "Kotlin DEMO数据1",
                "Kotlin DEMO数据1", "Kotlin DEMO数据17"));
    }
}
