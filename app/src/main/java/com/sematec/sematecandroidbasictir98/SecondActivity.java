package com.sematec.sematecandroidbasictir98;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtUserAge = findViewById(R.id.txtUserAge);

        Intent i = getIntent();
        String age = i.getStringExtra("age");

        txtUserAge.setText(age);

    }
}
