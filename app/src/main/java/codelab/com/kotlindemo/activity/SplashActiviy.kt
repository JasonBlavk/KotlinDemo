package codelab.com.kotlindemo.activity

import android.app.Activity
import android.os.Bundle
import android.view.MenuItem

/**
 * Created by WhiteTec on 2017/6/23.
 */
class SplashActiviy : android.app.Activity() {

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onBackPressed() {
        super.onBackPressed()

    }

    override fun onOptionsItemSelected(item: android.view.MenuItem?): Boolean {
        when (item?.itemId){

        }

        return super.onOptionsItemSelected(item)

    }

}