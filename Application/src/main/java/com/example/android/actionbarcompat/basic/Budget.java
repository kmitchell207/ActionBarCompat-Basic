package com.example.android.actionbarcompat.basic;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.MenuItem;

public class Budget extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);
    }

    // BEGIN_INCLUDE(create_menu)
    /**
     * Use this method to instantiate your menu, and add your items to it. You
     * should return true if you have added items to it and want the menu to be displayed.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate our menu from the resources by using the menu inflater.
        getMenuInflater().inflate(R.menu.main, menu);


        return super.onCreateOptionsMenu(menu);
    }
    // END_INCLUDE(create_menu)

    // BEGIN_INCLUDE(menu_item_selected)
    /**
     * This method is called when one of the menu items to selected. These items
     * can be on the Action Bar, the overflow menu, or the standard options menu. You
     * should return true if you handle the selection.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_home:

           Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);

                // Here we might start a background refresh task
                return true;


            case R.id.prof:
                Intent intent4 = new Intent(this, Profile.class);
                startActivity(intent4);
                // Here we would open up our settings activity
                return true;
            case R.id.Settings:

                Intent intent2 = new Intent(this, Settings.class);
                startActivity(intent2);
                // Here we would open up our settings activity
                return true;
            case R.id.calendarView:
                Intent intent3 = new Intent(this, Calendar.class);
                startActivity(intent3);
                // Here we would open up our settings activity
                return true;
            case R.id.Budget:
                Intent intent5 = new Intent(this, Budget.class);
                startActivity(intent5);
                // Here we would open up our settings activity
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
