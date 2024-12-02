package com.college.questions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This EditText contains the user input
        // for the number of burgers
        EditText numberStr = findViewById(R.id.numberId);

        // This Textview displays the result of multiplying
        // the content of the numberId EditText by 5
        TextView resultTv = findViewById(R.id.resultId);

        // TODO
        // Implement the 2 listeners for buttons 'clear' and 'pay'
        // One burger is $5
        // Result should contain 5 multiplied by number chosen
        // Display should be prefixed with the '$' sign such as $15
        // Reset should clear all the fields


        Button payBtn = findViewById(R.id.btnPayId);
        Button clearBtn = findViewById(R.id.btnResetId);

        payBtn.setOnClickListener(view -> {
            // Extract the string
            String burgerNumber = numberStr.getText().toString();

            // Parse it into a double in order to do arithmetic equations
            Double number_burg = Double.parseDouble(burgerNumber);

            Double result = number_burg * 5;

            //Display the results with the '$' sign
            resultTv.setText(getString(R.string.dollar_sign, String.valueOf(result)));

            Toast.makeText(this, "Payment received!", Toast.LENGTH_SHORT).show();
        });

        clearBtn.setOnClickListener(view -> {
            //Clears the textview and the edit text
            numberStr.setText("");
            resultTv.setText(" ");
        });


    }

}