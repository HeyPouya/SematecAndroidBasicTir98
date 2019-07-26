package com.sematec.sematecandroidbasictir98;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestSharedPreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shared_preferences);
        Button btnSave = findViewById(R.id.btnSave);
        final EditText edtName = findViewById(R.id.edtName);
        TextView txtName = findViewById(R.id.txtName);


        String userName = PreferenceManager.getDefaultSharedPreferences(TestSharedPreferencesActivity.this)
                .getString("userName", "Unknown Name!!!");

        txtName.setText(userName);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                PreferenceManager.getDefaultSharedPreferences(TestSharedPreferencesActivity.this).edit().putString("userName", name).apply();


            }
        });


    }
}
