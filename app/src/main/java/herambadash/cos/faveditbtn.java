package herambadash.cos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
public class faveditbtn extends AppCompatActivity {

    //StringBuffer ab = null;
    //FavEditBtnRVA adapter;
    //ArrayList<FavEditBtnRVC> mitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faveditbtn);

        Button btn = (Button)findViewById(R.id.button2);

        ArrayList<String> mitems = new ArrayList<>();
        for(int i=0;i<20;++i)
        {
            mitems.add(String.valueOf(i));
        }

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.favbtn_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(new FavEditBtnRVA(getApplicationContext(),mitems));


    }


}
