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

public class Basics extends Fragment {

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
    Button btn12;
    Button btn13;
    Button btn14;
    Button btn15;

    public Basics() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_basics, container, false);
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
        btn12 = (Button) v.findViewById(R.id.b12);
        btn13 = (Button) v.findViewById(R.id.b13);
        btn14 = (Button) v.findViewById(R.id.b14);
        btn15 = (Button) v.findViewById(R.id.b15);
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
                String val="6";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="7";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="8";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="9";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="10";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="11";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="12";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="13";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="14";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="15";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="16";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="17";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="18";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="19";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                String val="20";
                e.putString("check",val);
                e.apply();
                Intent intent = new Intent(getActivity(), FourthActivity.class);
                Basics.this.startActivity(intent);
            }
        });





}
}
