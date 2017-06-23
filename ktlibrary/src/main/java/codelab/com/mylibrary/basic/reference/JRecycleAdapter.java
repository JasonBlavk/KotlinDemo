package codelab.com.mylibrary.basic.reference;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by WhiteTec on 2017/5/18.
 */

public class JRecycleAdapter extends RecyclerView.Adapter<JRecycleAdapter.ViewHolder> {
    private static final String TAG = "JRecycleAdapter";

    private List<String> items;

    public JRecycleAdapter(List<String> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(new TextView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(items.get(position));

        holder.textView.setOnClickListener(new View.OnClickListener() {

            int xx;
            @Override
            public void onClick(View v) {
                xx ++;
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public ViewHolder(TextView itemView) {
            super(itemView);
            textView = itemView;
        }
    }

}

