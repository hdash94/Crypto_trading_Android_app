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
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;


public class accountpage extends AppCompatActivity {

    Button btn;
    FirebaseAuth mauth;
    FirebaseAuth.AuthStateListener mauthListener;

    @Override
    protected void onStart() {
        super.onStart();
        mauth.addAuthStateListener(mauthListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountpage);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.botnavview);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.mark:
                        Intent intent1 = new Intent(accountpage.this, app_page1.class);
                        startActivity(intent1);
                        break;

                    case R.id.trad:
                        Intent intent2 = new Intent(accountpage.this, tradepage.class);
                        startActivity(intent2);
                        break;

                    case R.id.fnd:
                        Intent intent3 = new Intent(accountpage.this, fundspage.class);
                        startActivity(intent3);
                        break;

                    case R.id.acnt:
                        break;
                }


                return false;
            }
        });


        btn = (Button)findViewById(R.id.logoutbtn);

        mauthListener= new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if(firebaseAuth.getCurrentUser() == null)
                    startActivity(new Intent(accountpage.this, activity_login.class));
            }
        };

        mauth = FirebaseAuth.getInstance();

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                mauth.signOut();

            }
        });

    }
}
