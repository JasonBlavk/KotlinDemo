package codelab.com.kotlindemo.activity

import codelab.com.mylibrary.utils.makeToast

/**
 * Created by WhiteTec on 2017/6/23.
 */

class SecondActivity : android.app.Activity() {
    override fun onCreate(savedInstanceState: android.os.Bundle?) {
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


