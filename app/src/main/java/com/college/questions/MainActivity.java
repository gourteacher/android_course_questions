package com.college.questions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * The ImplicitIntents app contains three buttons for sending implicit intents:
 * - Open a URL in a browser
 * - Find a location on a map
 * - Share a text string
 */
public class MainActivity extends AppCompatActivity {

    private final String LOG_TAG="MainActivity";
    // EditText view for the website URI
    private EditText mWebsiteEditText;
    // EditText view for the location URI
    private EditText mLocationEditText;
    // EditText view for the share text
    private EditText mShareTextEditText;

    /**
     * Initializes the activity.
     *
     * @param savedInstanceState The current state data
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebsiteEditText = findViewById(R.id.website_edittext);
        mLocationEditText = findViewById(R.id.location_editext);
        mShareTextEditText = findViewById(R.id.share_edittext);
    }

    // TODO
    /**
     * Handles the onClick for the "Open Website" button.  Gets the URI
     * from the edit text and sends an implicit intent for that URL.
     *
     * @param view The view (Button) that was clicked.
     */
    public void openWebsite(View view) {
    }

    // TODO
    /**
     * Handles the onClick for the "Open Location" button.  Gets the location
     * text from the edit text and sends an implicit intent for that location.
     *
     * The location text can be any searchable geographic location.
     *
     * @param view The view (Button) that was clicked.
     */
    public void openLocation(View view) {

    }

    // TODO
    /**
     * Handles the onClick for the "Share This Text" button.  The
     * implicit intent here is created by the  {@link ShareCompat.IntentBuilder}
     * class.  An app chooser appears with the available options for sharing.
     *
     * ShareCompat.IntentBuilder is from the v4 Support Library.
     *
     * @param view The view (Button) that was clicked.
     */
    public void shareText(View view) {

    }

    // TODO
    /**
     * Handles the onClick for the "Dial" button.
     *
     * @param view The view (Button) that was clicked.
     */
    public void dial(View view) {
    }

    // TODO
    /**
     * Handles the onClick for the "View Contacts" button.
     *
     * @param view The view (Button) that was clicked.
     */
    public void viewContact(View view) {

    }

}
