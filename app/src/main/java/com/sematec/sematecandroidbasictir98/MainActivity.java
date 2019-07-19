package com.sematec.sematecandroidbasictir98;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtAge = findViewById(R.id.txtAge);
        Button btnShowName = findViewById(R.id.btnShowName);
        final EditText edtAge = findViewById(R.id.edtAge);
        ImageView imgProfile = findViewById(R.id.imgProfile);


        txtAge.setText("Pouya");


        btnShowName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edtAge.getText().toString();
                Log.d("MYTAG", "Result is " + s);
                txtAge.setText(s);
            }
        });

        Log.d("MYTAG", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MYTAG", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYTAG", "onResume");
    }
}
