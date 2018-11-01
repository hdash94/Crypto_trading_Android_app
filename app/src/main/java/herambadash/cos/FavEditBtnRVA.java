package herambadash.cos;


import android.content.Context;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FavEditBtnRVA extends RecyclerView.Adapter<FavEditBtnRVA.MyViewHolder>{

    Context mcontext;
    private ArrayList<String> mlist;
    private HashMap<String, Boolean> mChecked;
    private ArrayList<String> clist;



    public FavEditBtnRVA(){
    }

    public FavEditBtnRVA(Context mcontext, ArrayList<String> arrayList) {
        this.mcontext = mcontext;
        this.mlist = arrayList;
        this.mChecked = new HashMap<>();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.favpagelayout, parent, false);
        MyViewHolder vh = new MyViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.mText.setText(mlist.get(position));
        holder.mCheckBox.setOnCheckedChangeListener(null);
        if(mChecked.containsKey(mlist.get(position))) {
            holder.mCheckBox.setChecked(mChecked.get(mlist.get(position)));
        }
        else {
            holder.mCheckBox.setChecked(false);
        }
        holder.mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mChecked.put(mlist.get(holder.getAdapterPosition()), isChecked);
                //Toast.makeText(mcontext, "Selected", Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }






    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView mText;
        private AppCompatCheckBox mCheckBox;

        public MyViewHolder(View itemView) {
            super(itemView);

            mText = (TextView) itemView.findViewById(R.id.coinnamefav);
            mCheckBox = (AppCompatCheckBox) itemView.findViewById(R.id.chkbox);

        }
    }
}
