package codelab.com.mylibrary.animstate

/**
 * Created by WhiteTec on 2017/6/22.
 */


interface OnAnimCompleteListener {
    fun onAnimComplete(eventId: Int, eventName: String, trackIndex: Int, loopCount: Int): Boolean
}

