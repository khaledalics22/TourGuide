package com.example.tourguide;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/*
TODO
The app can list top attractions, restaurants, public places, or events for the city

TODO
If you need help generating bitmaps for your project, refer back to the Generating Your Own Bitmaps concept.

TODO
App contains at least 4 lists of relevant attractions for a location

TODO
Navigation

User navigates between lists in Fragments using either a Navigation Drawer or a ViewPager plus TabLayout.
TODO
List Item Contents

Each list item contains information about an event, restaurant, historical site, or similar.
TODO
Pictures

At least one list includes pictures of the location.
TODO
Layout Best Practices

The code adheres to all of the following best practices:
TODO
Text sizes are defined in sp
Lengths are defined in dp
Padding and margin is used appropriately, such that the views are not crammed up against each other.



ToDO
App contains a custom object for storing location information .
ToDO
Custom Adapter
App uses a custom adapter to populate the layout with views based on instances of the custom class.
ToDO
String Storage

All strings are stored in the strings.xml resource file.
ToDO
Image Storage

All images are stored as drawables.

All drawables are stored at multiple densities.
*/




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
