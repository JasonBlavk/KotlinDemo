package codelab.com.kotlindemo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.GridLayoutManager
import codelab.com.kotlindemo.R
import codelab.com.kotlinexperment.HeaderNumberedAdapter
import kotlinx.android.synthetic.main.activity_custom_recycleview.*

/**
 * Created by WhiteTec on 2017/7/12.
 */

class CustomRecycleActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_recycleview)

        initGridView()

    }

    private fun initGridView() {
        val manager = GridLayoutManager(this, 3)

        manager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                when (position) {
                    0, 2 -> return manager.spanCount
                    1, 3, 4, 5 -> return 2
                    else -> return 1
                }
            }
        }

        grid_recycleview.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        grid_recycleview.layoutManager = manager

        val header = layoutInflater.inflate(R.layout.header, grid_recycleview, false);

        grid_recycleview.adapter = HeaderNumberedAdapter(header, 30)
    }

}