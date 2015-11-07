package demo.android.com.menusandpreferencesdemo;

import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new PreferenceScreenFragment()).commit();
    }

    public static class PreferenceScreenFragment extends  { // TODO: 11/7/15 What does this extend?
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            // TODO: 11/7/15 Add the preference from a resource (if you can't figure out which method to use, this line hints at it)
        }
    }
}
