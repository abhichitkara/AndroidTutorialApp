package com.example.abhi.tutorialfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class overview extends Fragment {


    public overview() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_overview, container, false);
        Button btn1 = (Button) v.findViewById(R.id.b1);
        Button btn2 = (Button) v.findViewById(R.id.b2);
        Button btn3 = (Button) v.findViewById(R.id.b3);
        Button btn4 = (Button) v.findViewById(R.id.b4);
        Button btn5 = (Button) v.findViewById(R.id.b5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ThirdActivity.class);
                intent.putExtra("Check","1");
                overview.this.startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ThirdActivity.class);
                intent.putExtra("Check","2");
                overview.this.startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ThirdActivity.class);
                intent.putExtra("Check","3");
                overview.this.startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ThirdActivity.class);
                intent.putExtra("Check","4");
                overview.this.startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ThirdActivity.class);
                intent.putExtra("Check","5");
                overview.this.startActivity(intent);
            }
        });



        return v;
    }

}