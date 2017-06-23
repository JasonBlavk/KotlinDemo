package codelab.com.mylibrary.animstate

/**
 * Created by WhiteTec on 2017/6/22.
 */


interface OnAnimStartListener {
    fun OnAnimStart(eventId: Int, eventName: String, trackIndex: Int, loopCount: Int): Boolean
}
