package com.sematec.sematecandroidbasictir98;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class TestThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_thread);

        Log.d("MYTAG", Thread.currentThread().getName());


        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("MYTAG", Thread.currentThread().getName());
            }
        }).start();
    }
}
