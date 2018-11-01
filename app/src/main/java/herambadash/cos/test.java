package herambadash.cos;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.Web3jFactory;
import org.web3j.protocol.core.Ethereum;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

import java.util.concurrent.ExecutionException;

public class test extends AppCompatActivity {
     Web3ClientVersion web3ClientVersion;
    String clientv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
/*
        Web3j web3 = Web3jFactory.build(new HttpService("https://9c20e177.ngrok.io"));
        try {
            web3ClientVersion = web3.web3ClientVersion().sendAsync().get();
            clientv = web3ClientVersion.getWeb3ClientVersion();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        TextView tv1 = (TextView)findViewById(R.id.textspace);
        tv1.setText(clientv);
 */   }
}
