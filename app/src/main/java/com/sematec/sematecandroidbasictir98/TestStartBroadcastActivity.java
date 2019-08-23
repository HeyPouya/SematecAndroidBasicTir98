package com.sematec.sematecandroidbasictir98;

import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TestStartBroadcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_start_broadcast);


        TestBroadcastReceiver receiver = new TestBroadcastReceiver();

        IntentFilter filter = new IntentFilter();
        filter.addAction("android.intent.action.AIRPLANE_MODE");


        registerReceiver(receiver, filter);
    }
}
