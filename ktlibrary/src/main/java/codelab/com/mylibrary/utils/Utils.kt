package codelab.com.mylibrary.utils

import android.app.Activity
import android.widget.Toast

/**
 * Created by WhiteTec on 2017/6/23.
 */


fun Activity.makeToast(message : String, duration : Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,message,duration)
}


fun Any?.toString() :String {
    if (this == null){
        return "null"
    } else {
        return toString()
    }
}