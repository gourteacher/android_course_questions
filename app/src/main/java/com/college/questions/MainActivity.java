package com.college.questions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This EditText contains the user input
        // for the number of burgers
        EditText numberStr = findViewById(R.id.numberId);

        // This yextview displays the resut of multiplying
        // the content of the numberId EditText by 5
        TextView resultTv = findViewById(R.id.resultId);

        // TODO
        // Implement the 2 listeners for buttons 'clear' and 'pay'
        // One burger is $5
        // Result should contain 5 multiplied by number chosen
        // Display should be prefixed with the '$' sign such as $15
        // Reset should clear all the fields
    }
}