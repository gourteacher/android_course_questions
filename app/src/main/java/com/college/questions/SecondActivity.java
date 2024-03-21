package com.college.questions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class SecondActivity extends AppCompatActivity {
    static private final String TAG = "SecondActivity";

    private ArrayList<String> myList;

    private ArrayAdapter<String> myAdapter;

    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myList);

        myListView = findViewById(R.id.listView);
        myListView.setAdapter(myAdapter);


    }

    void initData(ArrayList<String> data) {
        for (int i=0; i < 10; i++) {
            data.add("Item " + i);
        }
    }
}