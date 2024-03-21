package com.college.questions;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


/*

 TODO:
  Fix the bugs in this application.

*/

public class MainActivity extends AppCompatActivity {

    static private final String TAG = "MainActivity";

    Button btnNext = findViewById(R.id.btn_move_to_next);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnNext.setOnClickListener(v -> {
            // Move to SecondActivity
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });

    }

}