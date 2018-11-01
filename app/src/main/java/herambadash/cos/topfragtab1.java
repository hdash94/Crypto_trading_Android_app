package herambadash.cos;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.google.ads.mediation.customevent.CustomEventAdapter;

import java.util.ArrayList;
import java.util.List;


public class topfragtab1 extends Fragment {
    private static final String TAG = "Tab1Fragment";

   // private RecyclerView mRecyclerView ;
    //private RecyclerViewAdapter mRecyclerViewAdapter;
    private ArrayList<RecyclerViewClass1> mItems;
    //private RecyclerView.LayoutManager mlayoutManager;
    //Context mContext;
    FavEditBtnRVA adapter;
    RecyclerView recyclerView;



    @Nullable
    @Override
     public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.topfrag1,container,false);

        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerview1);
        //mContext = this.getContext();


        adapter = new FavEditBtnRVA();
        FloatingActionButton fab = (FloatingActionButton)view.findViewById(R.id.editbtn);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openeditfav = new Intent(getActivity(),faveditbtn.class);
                startActivity(openeditfav);
            }
        });

        //RecyclerViewAdapter mRecyclerViewAdapter = new RecyclerViewAdapter(getActivity(),mItems);
        //recyclerView.setAdapter(mRecyclerViewAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mItems = new ArrayList<>();

        for(int i=0;i<100;i++){
            mItems.add(new RecyclerViewClass1(i+"string1",i+"string2",i+"string3",i+"string4",i+"string5",i+"string6"));

        }

        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //recyclerView = (RecyclerView)view.findViewById(R.id.recyclerview1);
        RecyclerViewAdapter mRecyclerViewAdapter = new RecyclerViewAdapter(getActivity(),mItems);
        recyclerView.setAdapter(mRecyclerViewAdapter);
       //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        //recyclerView.setLayoutManager(layoutManager);
        //ecyclerView.setHasFixedSize(true);
        //recyclerView.setItemAnimator(new DefaultItemAnimator());
    }




}
