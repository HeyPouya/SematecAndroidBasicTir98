package com.sematec.sematecandroidbasictir98;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestHandlerActivity extends AppCompatActivity {


    Boolean hasUserClickedOnBack = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_handler);
    }


    @Override
    public void onBackPressed() {
        if (hasUserClickedOnBack) {
            super.onBackPressed();
        } else {
            hasUserClickedOnBack = true;
            Toast.makeText(TestHandlerActivity.this, "Please press back again", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    hasUserClickedOnBack = false;
                }
            }, 2500);
        }
    }
}
