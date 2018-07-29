package com.example.abhi.tutorialfinal;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Button b = (Button) findViewById(R.id.mm);

        TabLayout t1 = (TabLayout) findViewById(R.id.tab_bas);

        TabLayout.Tab Java = t1.newTab();
        Java.setText("Java");
        t1.addTab(Java);

        TabLayout.Tab XML = t1.newTab();
        XML.setText("XML");
        t1.addTab(XML);

        TabLayout.Tab Example = t1.newTab();
        Example.setText("Example");
        t1.addTab(Example);

        loadFragment(new Java(), "Java");

        t1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                                        @Override
                                        public void onTabSelected(TabLayout.Tab tab) {

                                            if (tab.getPosition() == 0) {
                                                loadFragment(new Java(), "Java");
                                            }

                                            if (tab.getPosition() == 1) {
                                                loadFragment(new XML(), "XML");
                                            }

                                            if (tab.getPosition() == 2) {
                                                loadFragment(new Example(), "Example");
                                            }

                                        }

                                        @Override
                                        public void onTabUnselected(TabLayout.Tab tab) {

                                        }

                                        @Override
                                        public void onTabReselected(TabLayout.Tab tab) {

                                        }
                                    });



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FourthActivity.this,SecondActivity.class));
            }
        });
    }
    private void loadFragment(Fragment fragment, String tag) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_bas, fragment, tag);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
