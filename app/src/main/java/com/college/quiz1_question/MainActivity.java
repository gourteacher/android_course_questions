package com.college.quiz1_question;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;


/*

 This application uses the Navigation Component for the  fragments.

 It has a Bottom Navigation to move between the fragments.

 We have : InboxFragment, OutBoxFragent and HelpFragment

 TODO 1:
 Bottom Navigation currently contains Inbox and Outbox menu items.
 Complete it so that the user can switch to HelpFragment

 TODO 2:
 Add an CatFragment that displays:
    1. The text "Cat Fragment" in a TextView.
    2. An image view below the TextView with a Cat image.
        There is a cat image in res/drawable
 Add this new fragment to the Bottom Navigation

 Note:
 You will need to update the navigation graph

*/

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavHostFragment navHostFragment = (NavHostFragment)getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = null;
        if (navHostFragment != null) {
            navController = navHostFragment.getNavController();
        }

        BottomNavigationView bottomNav = findViewById(R.id.nav_bottom_view);
        if (navController != null) {
            NavigationUI.setupWithNavController(bottomNav, navController);
        }

    }
}