package com.college.quiz1_question;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

/*
   TODO: Use ViewModel to store the data and keep the data when the device is rotated.
    
 */
public class MainActivity extends AppCompatActivity {

    static private final Float CONVERSION_RATE = 0.80F;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConvert = findViewById(R.id.convertButton);

        buttonConvert.setOnClickListener( view ->  {

            convert_currency(view);

        } );

    }

    public void convert_currency(View view) {

        EditText inputView = findViewById(R.id.entryId);

        //"11.0"
        String inputAmount = inputView.getText().toString();

        if (!inputAmount.isEmpty()) {
            Float inputAmountDecimal = Float.valueOf(inputAmount);

            Float resultFloat = inputAmountDecimal * CONVERSION_RATE;

            TextView resultView = findViewById(R.id.resultId);

            resultView.setText(String.format (Locale.CANADA, "%.2f  Euros", resultFloat));
        }
    }
}