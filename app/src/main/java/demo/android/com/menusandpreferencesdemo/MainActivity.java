package demo.android.com.menusandpreferencesdemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    TextView userNameTextView;
    TextView servicesTextView;
    TextView notificationsTextView;

    // TODO: 11/7/15 Create a SharedPreferences variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameTextView = (TextView) findViewById(R.id.username);
        servicesTextView = (TextView) findViewById(R.id.services);
        notificationsTextView = (TextView) findViewById(R.id.notifications);

        // TODO: 11/7/15 Initilize the SharedPreferences variable

        // TODO: 11/7/15 Set the text of the usernameTextView
        Set<String> servicesSet = preferences.getStringSet("services", null);
        if (servicesSet != null) {
            String[] servicesArray = servicesSet.toArray(new String[servicesSet.size()]);
            servicesTextView.setText(Arrays.toString(servicesArray));
        }
        // TODO: 11/7/15 Set text of the notificationsTextView
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(/*What goes here?*/, menu); // TODO: 11/7/15 Finish this line
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                // TODO: 11/7/15 Create the intent that opens SettingsActivity
                return true;
            case R.id.reload:
                // TODO: 11/7/15 Put the code needed to reload the views on the screen (remember, it's copy-paste from what we already have)
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
