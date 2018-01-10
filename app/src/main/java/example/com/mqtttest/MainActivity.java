package example.com.mqtttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(new Runnable() {
            @Override
            public void run() {
                MQTTManager.getInstance(MainActivity.this).connect();
                if(MQTTManager.getInstance(MainActivity.this).isConnected()){
                    Log.d("","连接成功===");
                }
            }
        }).start();
    }
}
