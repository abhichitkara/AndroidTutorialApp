package com.example.abhi.tutorialfinal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class SecondActivity extends AppCompatActivity {
    public Menu m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TabLayout t1 = (TabLayout) findViewById(R.id.tab_home);

        TabLayout.Tab overview = t1.newTab();
        overview.setText("Overview");
        t1.addTab(overview);

        TabLayout.Tab Basics = t1.newTab();
        Basics.setText("Basics");
        t1.addTab(Basics);

        TabLayout.Tab Advanced = t1.newTab();
        Advanced.setText("Advanced");
        t1.addTab(Advanced);

        loadFragment(new overview(), "Overview");

        t1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition() == 0) {
                    loadFragment(new overview(), "Overview");
                }

                if (tab.getPosition() == 1) {
                    loadFragment(new Basics(), "Basics");
                }

                if (tab.getPosition() == 2) {
                    loadFragment(new Advanced(), "Advanced");
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.mymenu,menu);
        SharedPreferences sp = getSharedPreferences("my_sp", Context.MODE_PRIVATE);
        String usr = sp.getString("username", "Guest User");
        MenuItem menuItem = menu.findItem(R.id.usinfo);
        menuItem.setTitle("Welcome, " + usr);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.lo){
            SharedPreferences sp = getSharedPreferences("my_sp",MODE_PRIVATE);
            SharedPreferences.Editor e = sp.edit();
            e.clear();
            e.commit();
            startActivity(new Intent(SecondActivity.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
    private void loadFragment(Fragment fragment, String tag) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_home, fragment, tag);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}

