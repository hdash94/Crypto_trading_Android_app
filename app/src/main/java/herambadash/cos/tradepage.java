package herambadash.cos;

import android.app.Fragment;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class tradepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradepage);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.botnavview);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.mark:
                        Intent intent1 = new Intent(tradepage.this, app_page1.class);
                        startActivity(intent1);
                        break;

                    case R.id.trad:

                        break;

                    case R.id.fnd:
                        Intent intent3 = new Intent(tradepage.this, fundspage.class);
                        startActivity(intent3);
                        break;

                    case R.id.acnt:
                        Intent intent4 = new Intent(tradepage.this, accountpage.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });




    }
}

