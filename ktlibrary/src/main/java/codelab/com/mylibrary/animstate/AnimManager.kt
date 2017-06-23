package codelab.com.mylibrary.animstate

/**
 * Created by WhiteTec on 2017/6/22.
 */
class AnimManager : OnAnimStateListener {


    override fun OnAnimStart(eventId: Int, eventName: String, trackIndex: Int, loopCount: Int): Boolean {

        return EventManager.onFold(eventId,eventName,trackIndex,loopCount,OnAnimStateListener::OnAnimStart)
    }


    override fun onAnimComplete(eventId: Int, eventName: String, trackIndex: Int, loopCount: Int): Boolean {
         //To change body of created functions use File | Settings | File Templates.
        return EventManager.onFold(eventId,eventName,trackIndex,loopCount, OnAnimStateListener::onAnimComplete)
    }



}