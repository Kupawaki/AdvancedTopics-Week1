package com.example.toolbarapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public int mode = 0;

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
        inflater.inflate(R.menu.tb_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        //Color Switch
        if(id == R.id.switchMode)
        {
            Toolbar toolbar = findViewById(R.id.mainTB);

            if(mode == 0)
            {
                toolbar.setBackgroundColor(getResources().getColor(R.color.purple_200));
                mode = 1;
                return true;
            }
            else if(mode == 1)
            {
                toolbar.setBackgroundColor(getResources().getColor(R.color.teal_200));
                mode = 2;
                return true;
            }
            else
            {
                toolbar.setBackgroundColor(getResources().getColor(R.color.white));
                mode = 0;
                return true;
            }
        }

        //Change activities
        if(id == )
        {

        }

        else
        {
            return false;
        }
    }
}