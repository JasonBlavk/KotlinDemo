package codelab.com.mylibrary.utils

import android.app.Activity
import android.content.ContentUris
import android.content.Context
import android.net.ConnectivityManager
import android.os.SystemClock
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import java.io.File

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

fun Context.isConnectedToNet(): Boolean {
    val tm = SystemClock.elapsedRealtime()
    val cnn = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    //wifi网络
    val wifiNetInfo = cnn.getNetworkInfo(ConnectivityManager.TYPE_WIFI)
    val mobileNetInfo = cnn.getNetworkInfo(ConnectivityManager.TYPE_MOBILE)
    val ret = wifiNetInfo != null && wifiNetInfo.isConnected
            || mobileNetInfo != null && mobileNetInfo.isConnected
    Log.d(TAG, "isConnectedToNet: $ret  waste time:" + (SystemClock.elapsedRealtime() - tm))
    return ret
}

/**
 * 将px值转换为dip或dp值，保证尺寸大小不变

 * @param pxValue
 * *
 * @param scale
 * *            （DisplayMetrics类中属性density）
 * *
 * @return
 */
fun Context.px2dp(pxValue: Float) = (pxValue / density + 0.5f).toInt()

/**
 * 将dip或dp值转换为px值，保证尺寸大小不变

 * @param dipValue
 * *
 * @param scale
 * *            （DisplayMetrics类中属性density）
 * *
 * @return
 */
fun Context.dip2px(dipValue: Float) = (dipValue * density + 0.5f).toInt()

/**
 * 将px值转换为sp值，保证文字大小不变

 * @param pxValue
 * *
 * @param fontScale
 * *            （DisplayMetrics类中属性scaledDensity）
 * *
 * @return
 */
fun Context.px2sp(pxValue: Float) = (pxValue / scaledDensity + 0.5f).toInt()

/**
 * 将sp值转换为px值，保证文字大小不变

 * @param spValue
 * *
 * @param fontScale
 * *            （DisplayMetrics类中属性scaledDensity）
 * *
 * @return
 */
fun Context.sp2px(spValue: Float) = (spValue * scaledDensity + 0.5f)//.toInt()

val Context.scaledDensity: Float get() = resources.displayMetrics.scaledDensity
val Context.density: Float get() = resources.displayMetrics.density

/**
 * 删除照片
 */
fun Context.deleteImage(imgPath: String?): Boolean {
    if (imgPath.isNullOrEmpty()) {
        return false
    }
    val resolver = getContentResolver()
    val cursor = MediaStore.Images.Media.query(resolver, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, arrayOf<String>(MediaStore.Images.Media._ID), MediaStore.Images.Media.DATA + "=?",
            arrayOf(imgPath), null)
    var result = false
    val file = File(imgPath)
    if (cursor.moveToFirst()) {
        val id = cursor.getLong(0)
        val contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        val uri = ContentUris.withAppendedId(contentUri, id)
        val count = getContentResolver().delete(uri, null, null)
        result = count == 1
    } else {
        result = file.delete()
    }
    if (file.exists()) {
        file.delete()
    }
    Log.i(TAG, "deleteImage $imgPath")
    return !file.exists()
}

//删除文件夹和文件夹里面的文件
fun deleteDirFile(path: String, exclude: String = "")/*: Boolean */ {
    val dir = File(path)
    if (dir == null || !dir.exists() || !dir.isDirectory)
        return

    for (file in dir.listFiles()) {
        if (file.isFile && !file.absolutePath.equals(exclude))
            file.delete() // 删除其他文件
        else if (file.isDirectory)
            deleteDirFile(file.path, exclude) // 递规的方式删除文件夹
    }
    //return dir.delete()// 删除目录本身
}

val TAG: String = "Utils"

val symbolRegex = "[\\p{Punct}\\p{Space}]+".toRegex()
val symbolDataRegex = "[\\p{Punct}\\p{Space}\\d]+".toRegex()
fun isAlphbet(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
