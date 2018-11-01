package herambadash.cos;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

        ArrayList<RecyclerViewClass1> mItems;
        Context mContext;

        public RecyclerViewAdapter(Context mContext,ArrayList<RecyclerViewClass1> mItems ) {
            this.mItems = mItems;
            this.mContext = mContext;
        }

        @Override
        public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.topfrag11, parent, false);


            RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);

            return viewHolder;
        }

        @Override
        public void onBindViewHolder(RecyclerViewHolder holder, int position) {

            holder.binddata(mItems.get(position));
        }


        @Override
        public int getItemCount() {
            return mItems.size();
        }


}




