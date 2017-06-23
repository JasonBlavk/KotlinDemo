package codelab.com.kotlindemo

import android.app.Activity
import android.os.Bundle
import codelab.com.mylibrary.utils.makeToast

/**
 * Created by WhiteTec on 2017/6/23.
 */

class SecondActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()

        makeToast("hello baby")

    }
    override fun onBackPressed() {
        super.onBackPressed()
    }
}


