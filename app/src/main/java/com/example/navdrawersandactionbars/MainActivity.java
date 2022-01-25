package com.example.navdrawersandactionbars;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.navdrawersandactionbars.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int mode = 0;
    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_home).setOpenableLayout(drawer).build();

        NavigationView navigationView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);

        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        Log.d("NAV", "Inside onCreateOptionsMenu");
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Log.d("NAV", "Inside onOptionsItemSelected");

        int id = item.getItemId();

        Log.d("NAV", "ItemID=" + id);

        Toolbar toolbar = findViewById(R.id.toolbar);

        if(id == R.id.menuMode)
        {
            if(mode == 0)
            {
                toolbar.setBackgroundColor(getResources().getColor(R.color.purple_700));
                mode = 1;
            }
            else
            {
                toolbar.setBackgroundColor(getResources().getColor(R.color.purple_200));
                mode = 0;
            }
        }
        else if(id == R.id.menuSettings)
        {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
        }
        else if(id == 16908332)
        {
            onSupportNavigateUp();
        }

        return true;
    }

    @Override
    public boolean onSupportNavigateUp()
    {
        Log.d("NAV", "Inside onSupportNavigation");
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration) || super.onSupportNavigateUp();
    }
}