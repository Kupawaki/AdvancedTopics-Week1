package com.example.toolbarapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.mainTB);
        setSupportActionBar(toolbar);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if(id == R.id.menuItemSettings)
        {
//            Intent intent = new Intent(MainActivity.this, Settings.class);
//            startActivity(intent);
//            return true;

            Toolbar toolbar = findViewById(R.id.mainTB);
            toolbar.setTitle("Regular Toolbar");
            toolbar.setElevation(0);
            toolbar.setPopupTheme(R.style.Widget_AppCompat_ActionBar_Solid);
            toolbar.setBackgroundColor(getResources().getColor(R.color.design_default_color_on_secondary));
            return true;
        }

        else
        {
            return false;
        }
    }
}