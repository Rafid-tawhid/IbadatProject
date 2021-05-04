package com.example.ibadatproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FloatingActionButton floatingActionButton;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottom_nav);
        floatingActionButton=findViewById(R.id.fab);
        bottomNavigationView.setBackground(null);
        bottomNavigationView.getMenu().getItem(2).setEnabled(false);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        toolbar = findViewById(R.id.toolbar);


        ActionBarDrawerToggle toggle = new
                ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close){
                    /** Called when a drawer has settled in a completely closed state. */
                    public void onDrawerClosed(View view) {
                        super.onDrawerClosed(view);
                   floatingActionButton.show();
                    }

                    /** Called when a drawer has settled in a completely open state. */
                    public void onDrawerOpened(View drawerView) {
                        super.onDrawerOpened(drawerView);
                        floatingActionButton.hide();
                    }
                };


        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();



        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                if (item.getItemId() == R.id.nav_men) {
//                    Toast.makeText(MainActivity.this, "okk", Toast.LENGTH_SHORT).show();
//
//                }
//                if (item.getItemId() == R.id.nav_women) {
//                    Toast.makeText(MainActivity.this, "okk", Toast.LENGTH_SHORT).show();
//
//                }

                return false;
            }
        });
        navigationView.setCheckedItem(R.id.nav_home);
        navigationView.bringToFront();

    }


}