package codelab.com.kotlinexperment

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import codelab.com.kotlindemo.R

/**
 * @author WhiteTec 2017/7/11
 */
open class TextViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var textView: TextView

    init {
        textView = itemView.findViewById(R.id.text) as TextView

    }

}