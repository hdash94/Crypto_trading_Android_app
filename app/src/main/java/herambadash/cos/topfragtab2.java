package herambadash.cos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class topfragtab2 extends Fragment {
    private static final String TAG = "Tab2Fragment";
    private ArrayList<RecyclerViewClass1> mItems;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.topfrag2,container,false);

        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recyclerview2);
        //mContext = this.getContext();

        mItems = new ArrayList<>();

        for(int i=0;i<100;i++){
            mItems.add(new RecyclerViewClass1(i+"string1",i+"string2",i+"string3",i+"string4",i+"string5",i+"string6"));

        }


        RecyclerViewAdapter mRecyclerViewAdapter = new RecyclerViewAdapter(getContext(),mItems);
        recyclerView.setAdapter(mRecyclerViewAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        return view;
    }
}
