package codelab.com.mylibrary.basic.recycleview

/**
 * Created by WhiteTec on 2017/5/18.
 */
class RecycleAdapter (val items : List<String>) : android.support.v7.widget.RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: android.view.ViewGroup, viewType: Int): codelab.com.mylibrary.basic.recycleview.RecycleAdapter.ViewHolder {
        return codelab.com.mylibrary.basic.recycleview.RecycleAdapter.ViewHolder(android.widget.TextView(parent.context))
    }

    //绑定ViewHolder并设置数据
    override fun onBindViewHolder(holder: codelab.com.mylibrary.basic.recycleview.RecycleAdapter.ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    //实现getItemCount，处理数据的条目数量
    override fun getItemCount(): Int = items.size;

    //定义ViewHolder，现在只需要一个  TextView
    class ViewHolder(val textView: android.widget.TextView) : android.support.v7.widget.RecyclerView.ViewHolder(textView);

}