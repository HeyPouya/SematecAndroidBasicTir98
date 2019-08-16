package com.sematec.sematecandroidbasictir98;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestDatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_database);

        Button btnInsert = findViewById(R.id.btnInsert);
        Button btnRead = findViewById(R.id.btnRead);

        final TestSQLiteHelper helper = new TestSQLiteHelper(TestDatabaseActivity.this, "grades", null, 1);


        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insertStudent("Pouya", "Heydari", 82);
            }
        });


        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = helper.getStudentsName();
                Toast.makeText(TestDatabaseActivity.this, result, Toast.LENGTH_LONG).show();
            }
        });
    }
}
