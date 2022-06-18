package com.college.quiz1_question;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mCounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //counterView is the TextView that displays the value of the counter
        TextView counterView = findViewById(R.id.counterId);

        //TODO
        Button btnReset = findViewById(R.id.buttonResetId);
        btnReset.setOnClickListener(click -> {
            mCounter = 0;
            counterView.setText(String.valueOf(mCounter));
        });

        Button btnIncrement = findViewById(R.id.buttonIncId);
        btnIncrement.setOnClickListener((clck) -> {
            mCounter++;
            counterView.setText(String.valueOf(mCounter));
        });

        Button btnDecrement = findViewById(R.id.buttonDecId);
        btnDecrement.setOnClickListener((clck) -> {
            mCounter--;
            mCounter = (mCounter < 0) ? 0 : mCounter;
            counterView.setText(String.valueOf(mCounter));
        });
    }
}