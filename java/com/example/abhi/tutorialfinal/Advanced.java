package com.example.abhi.tutorialfinal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Advanced extends Fragment {


    public Advanced() {

    }

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_advanced, container, false);

        btn1 = (Button) v.findViewById(R.id.b1);
        btn2 = (Button) v.findViewById(R.id.b2);
        btn3 = (Button) v.findViewById(R.id.b3);
        btn4 = (Button) v.findViewById(R.id.b4);
        btn5 = (Button) v.findViewById(R.id.b5);
        btn6 = (Button) v.findViewById(R.id.b6);
        btn7 = (Button) v.findViewById(R.id.b7);
        btn8 = (Button) v.findViewById(R.id.b8);
        btn9 = (Button) v.findViewById(R.id.b9);
        btn10 = (Button) v.findViewById(R.id.b10);
        btn11 = (Button) v.findViewById(R.id.b11);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="21";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Advanced.this.startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="22";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Advanced.this.startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="23";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Advanced.this.startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="24";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Advanced.this.startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="25";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Advanced.this.startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="26";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Advanced.this.startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="27";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Advanced.this.startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="28";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Advanced.this.startActivity(intent);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="29";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Advanced.this.startActivity(intent);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="30";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Advanced.this.startActivity(intent);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="31";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Advanced.this.startActivity(intent);
            }
        });


    }
}