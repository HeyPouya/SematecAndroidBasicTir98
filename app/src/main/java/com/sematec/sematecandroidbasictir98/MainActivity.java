package com.sematec.sematecandroidbasictir98;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    Button btnShowName;
    TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowName = findViewById(R.id.btnStartActivity);
        Button btnStartForResult = findViewById(R.id.btnStartForResult);
        final EditText edtAge = findViewById(R.id.edtAge);
        ImageView imgProfile = findViewById(R.id.imgProfile);
        txtName = findViewById(R.id.txtName);


        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is a message!", Toast.LENGTH_LONG).show();
            }
        });


        btnShowName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userAge = edtAge.getText().toString();

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("age", userAge);
                startActivity(i);

            }
        });


        btnStartForResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userAge = edtAge.getText().toString();

                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("age", userAge);

                startActivityForResult(intent, 1456);
            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1456) {
            if (resultCode == Activity.RESULT_OK) {
                String name = data.getStringExtra("userName");
                txtName.setText(name);
            }
        }
    }
}
