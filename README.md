# Practice projects for Android programming

## Branch `burger_question`
Implement the 2 listeners for buttons 'clear' and 'pay'
 - One burger is $5
 - Result should contain 5 multiplied by number chosen
 - Display should be prefixed with the '$' sign such as $15
 - Reset should clear all the fields

## Branch `implicitIntents_question`
It contains buttons for sending implicit intents:
- Open a URL in a browser.
- Find a location on a map.
- Share a text string.
- View the Contacts
- Dial a number

## Branch `shared_preferences_question`
This project is an adaptation from Google Sample Code. It includes:
- Buttons for changing the background Color. (This is done)
- Buttons to count up and reset the Counter => TODO
- Save and Restaure Prefs button to store and retrieve current color and Counter => TODO

Each branch has a MainActivity.java file where the work to do is identified by a `TODO`. 
This is the only file to change. Everything else is done for you.


### Branch read_json_question
- This application decodes a JSON file and displays the results on a textview.
- The application reads a restaurants JSON file and builds a list of restaurants.
- We then display the list of the names of the restaurants  in the TextView.

### Branch fragment_question
- This application uses the Navigation Component for the  fragments.
- It has a Bottom Navigation to move between the fragments.
- We have : InboxFragment, OutBoxFragment and HelpFragment

- TODO 1:
    - Bottom Navigation currently contains Inbox and Outbox menu items.
    - Complete it so that the user can switch to HelpFragment

- TODO 2:
    - Add a CatFragment that displays:
    - 1. The text "Cat Fragment" in a TextView.
    - 2. An image view below the TextView with a Cat image.
    - There is a cat image in res/drawable
    - Add this new fragment to the Bottom Navigation
