package herambadash.cos;

import android.content.Intent;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class app_page1 extends AppCompatActivity {
    private static final String TAG = "appPage1";
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_page1);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewpager = (ViewPager)findViewById(R.id.contain);
        setupViewPager(mViewpager);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewpager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_fav);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_market);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_search);



        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.botnavview);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.mark:
                        break;

                    case R.id.trad:
                        Intent intent2 = new Intent(app_page1.this, tradepage.class);
                        startActivity(intent2);
                        break;

                    case R.id.fnd:
                        Intent intent3 = new Intent(app_page1.this, fundspage.class);
                        startActivity(intent3);
                        break;

                    case R.id.acnt:
                        Intent intent4 = new Intent(app_page1.this, accountpage.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });


        ImageButton ibt1 = (ImageButton) findViewById(R.id.ibt1);
        TextView tv1= (TextView)findViewById(R.id.tv1);
        //expandTouchArea(ibt1, tv1, 10);
        ibt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.isSelected()==true)
                    v.setSelected(false);
                else
                    v.setSelected(true);
                // normal click action here
            }

        });


        ImageButton ibt2 = (ImageButton) findViewById(R.id.ibt2);
        TextView tv2= (TextView)findViewById(R.id.tv2);
        //expandTouchArea(ibt2, tv2, 10);
        ibt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.isSelected()==true)
                    v.setSelected(false);
                else
                    v.setSelected(true);
                // normal click action here
            }
        });


        ImageButton ibt3 = (ImageButton) findViewById(R.id.ibt3);
        TextView tv3= (TextView)findViewById(R.id.tv3);
        //expandTouchArea(ibt3, tv3, 10);
        ibt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.isSelected()==true)
                    v.setSelected(false);
                else
                    v.setSelected(true);
                // normal click action here
            }

        });


        ImageButton ibt4 = (ImageButton) findViewById(R.id.ibt4);
        TextView tv4= (TextView)findViewById(R.id.tv4);
        //expandTouchArea(ibt4, tv4, 10);
        ibt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.isSelected()==true)
                    v.setSelected(false);
                else
                    v.setSelected(true);
                // normal click action here
            }
        });



    }

    private void setupViewPager(ViewPager mViewpager) {
        SectionsPagerAdapter adapter=new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new topfragtab1());
        adapter.addFragment(new topfragtab2());
        adapter.addFragment(new topfragtab3());
        mViewpager.setAdapter(adapter);
    }

    /*public static void expandTouchArea(final View bigView, final View smallView, final int extraPadding) {
        bigView.post(new Runnable() {
            @Override
            public void run() {
                Rect rect = new Rect();
                smallView.getHitRect(rect);
                rect.right += extraPadding;
                bigView.setTouchDelegate(new TouchDelegate(rect, smallView));
            }
        });
    }*/
}
