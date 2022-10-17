package com.college.questions;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/*

 Complete the TODOs below

 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private ArrayList<String> myItems = new ArrayList<>(  );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> myAdapter;
        ListView myListView;

        //Retrieve the ListView
        myListView = findViewById(R.id.theListView);
        //Set up the Adapter
        myAdapter = new ArrayAdapter<>( this,
                android.R.layout.simple_expandable_list_item_1,
                myItems);
        myListView.setAdapter( myAdapter );

        //TODO 1: Add item at the top of the list
        // You can use createEntry() to generate a String

        //TODO 2: Add item at the end of the list.
        // You can use createEntry() to generate a String


        //TODO 3: Delete item at the top of the list);

        //TODO 4: Delete item at the bottom of the list.


        //TODO 5: Delete element when an item is clicked with a short click
        // Use the ListView

        //TODO 6: Add element after an item is clicked with a long click
        // Use the ListView

        //TODO 7: Clear all the items in the list

    }

    //Create a String to add in the row
    private String createEntry() {
        SimpleDateFormat dateformat =
                new SimpleDateFormat(" HH:mm:ss", Locale.CANADA);
        return dateformat.format(new Date());
    }
}
