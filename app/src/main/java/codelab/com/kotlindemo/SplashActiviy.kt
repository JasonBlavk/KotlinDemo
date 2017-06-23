package codelab.com.kotlindemo

import android.app.Activity
import android.os.Bundle
import android.view.MenuItem

/**
 * Created by WhiteTec on 2017/6/23.
 */
class SplashActiviy : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onBackPressed() {
        super.onBackPressed()

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId){

        }

        return super.onOptionsItemSelected(item)

    }

}