package herambadash.cos;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loader_page);

        Thread timer = new Thread() {

            public void run() {

                try{
                    sleep(3000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent openlogin = new Intent(mainActivity.this, activity_login.class);
                    startActivity(openlogin);
                    finish();

                }

            }
        };
        timer.start();
    }
}

