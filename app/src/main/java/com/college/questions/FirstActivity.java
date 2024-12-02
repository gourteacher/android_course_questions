package com.college.questions;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

/*

    TODO: Add a fourth activity to the bottom navigation view
    When clicked, this activity should be displayed
 */

public class FirstActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.home_id);

        // Perform item selected listener
        bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.home_id:
                    return true;
                case R.id.second_id:
                    startActivity(new Intent(getApplicationContext(), SecondActivity.class));
                    return true;
                case R.id.third_id:
                    startActivity(new Intent(getApplicationContext(), ThirdActivity.class));
                    return true;
                case R.id.fourth_id:
                    startActivity(new Intent(getApplicationContext(), FirstActivity.class));
                    return true;
            }
            return false;
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        View v = findViewById(R.id.my_rectangle);

        switch(id) {
            case R.id.red_id:
                v.setBackgroundColor(Color.RED);
                break;

            case R.id.blue_id:
                v.setBackgroundColor(Color.BLUE);
                break;

            case R.id.green_id:
                v.setBackgroundColor(Color.GREEN);
                break;

            case R.id.yellow_id:
                v.setBackgroundColor(Color.YELLOW);
                break;

            case R.id.move_to_next:
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}

