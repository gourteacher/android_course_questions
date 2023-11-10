package com.college.questions;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

/*
 TODO: Convert the below code to use View Binding
*/

public class MainActivity extends AppCompatActivity {

    static private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  addButton  = findViewById(R.id.add_button);
        TextView tvResult = findViewById(R.id.operation_result);

        addButton.setOnClickListener( (v) -> {
            EditText operandOne = findViewById(R.id.operand_one_edit);
            EditText operandTwo  = findViewById(R.id.operand_two_edit);

            String firstNumber = operandOne.getText().toString();
            String secondNumber = operandTwo.getText().toString();
            try {
                Integer numberOne = Integer.valueOf( firstNumber);
                Integer numberTwo = Integer.valueOf(secondNumber);
                int total = numberOne + numberTwo;

                tvResult.setText(String.format(Locale.CANADA, "%d", total));
            } catch (NumberFormatException e) {
                tvResult.setText(R.string.computationError);
            }

        });
    }


}
