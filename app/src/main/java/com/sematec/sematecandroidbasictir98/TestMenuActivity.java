package com.sematec.sematecandroidbasictir98;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.test_menu, menu);

        menu.add(0, 1, 0, "Fourth Item");
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.firstItem:
                Toast.makeText(TestMenuActivity.this, "First Item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.secondItem:
                Toast.makeText(TestMenuActivity.this, "Second Item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.thirdItem:
                Toast.makeText(TestMenuActivity.this, "Third Item", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(TestMenuActivity.this, "Fourth Item", Toast.LENGTH_SHORT).show();


        }

        return super.onOptionsItemSelected(item);
    }
}
