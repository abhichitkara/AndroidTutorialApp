package com.example.abhi.tutorialfinal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout t1 = (TabLayout) findViewById(R.id.tab_tut);

        TabLayout.Tab signin = t1.newTab();
        signin.setText("SIGN IN");
        t1.addTab(signin);

        TabLayout.Tab signup = t1.newTab();
        signup.setText("SIGN UP");
        t1.addTab(signup);

        loadFragment(new SignInFragment(), "SignIn");

        t1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition() == 1) {
                    loadFragment(new SignUpFragment(), "SignUp");
                }

                if (tab.getPosition() == 0) {
                    loadFragment(new SignInFragment(), "SignIn");
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

//        SharedPreferences sp = getSharedPreferences("my_sp", MODE_PRIVATE);




    private void loadFragment(Fragment fragment, String tag) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_tut, fragment, tag);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }


    }


