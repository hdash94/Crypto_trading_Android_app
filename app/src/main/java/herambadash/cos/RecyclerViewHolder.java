package herambadash.cos;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder{
    public TextView mtext2, mtext3;
    //public LinearLayout mLL2;
    public TextView mtext1,mtext6;
    //public LinearLayout mLL1;
    public TextView mtext4, mtext5;
    //public LinearLayout mLL3;

    private Context mContext;


    public RecyclerViewHolder(View itemView) {

        super(itemView);
        mtext2 = (TextView) itemView.findViewById(R.id.textView2);
        mtext3 = (TextView) itemView.findViewById(R.id.textView3);

        //mLL2 = (LinearLayout) itemView.findViewById(R.id.LL2);

        mtext1 = (TextView)itemView.findViewById(R.id.textView1);
        mtext6 = (TextView)itemView.findViewById(R.id.textView6);

        //mLL1 = (LinearLayout)itemView.findViewById(R.id.LL1);

        mtext4 = (TextView) itemView.findViewById(R.id.textView4);
        mtext5 = (TextView) itemView.findViewById(R.id.textView5);

        //mLL3 = (LinearLayout) itemView.findViewById(R.id.LL3);

        //mContext = itemView.getContext();

    }

    public void binddata(RecyclerViewClass1 recyclerViewClass1)
    {
        mtext1.setText(recyclerViewClass1.getText1());
        mtext2.setText(recyclerViewClass1.getText2());
        mtext3.setText(recyclerViewClass1.getText3());
        mtext4.setText(recyclerViewClass1.getText4());
        mtext5.setText(recyclerViewClass1.getText5());
        mtext6.setText(recyclerViewClass1.getText6());


    }
}

