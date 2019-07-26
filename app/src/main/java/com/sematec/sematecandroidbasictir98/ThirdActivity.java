package com.sematec.sematecandroidbasictir98;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        TextView txtAge = findViewById(R.id.txtAge);
        final EditText edtName = findViewById(R.id.edtName);
        Button btnOk = findViewById(R.id.btnOk);


        Intent intent = getIntent();
        final String userAge = intent.getStringExtra("age");

        txtAge.setText(userAge);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = edtName.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("userName", userName);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}
