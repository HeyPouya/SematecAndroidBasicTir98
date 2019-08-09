package com.sematec.sematecandroidbasictir98;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TestRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler);


        List<String> list = new ArrayList<>();
        list.add("Pouya Heydari");
        list.add("Mehdi Bakhtiari");
        list.add("Ahmadreza Bhrami");
        list.add("Mehrnaz Alirezae");
        list.add("Ehsan Haghdoost");
        list.add("Ali Saravani");
        list.add("Nasrollah Saffarh");
        list.add("Javad Tala");
        list.add("Shirin Nasrollahi");
        list.add("Mahdis Yadegari");
        list.add("Hasti Kashefi");


        RecyclerView recycler = findViewById(R.id.recycler);

        RecyclerAdapter adapter = new RecyclerAdapter(list);

        recycler.setAdapter(adapter);

        recycler.setLayoutManager(new LinearLayoutManager(TestRecyclerActivity.this, RecyclerView.VERTICAL, false));

    }
}
