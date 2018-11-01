package herambadash.cos;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class templogout extends AppCompatActivity {

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
        setContentView(R.layout.activity_templogout);
        btn = (Button)findViewById(R.id.logoutbtn);

        mauthListener= new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if(firebaseAuth.getCurrentUser() == null)
                    startActivity(new Intent(templogout.this, activity_login.class));
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
