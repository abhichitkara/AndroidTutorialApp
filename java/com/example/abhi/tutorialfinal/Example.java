package com.example.abhi.tutorialfinal;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Example extends Fragment {

    TextView tv;
    ImageView iv;

    public Example() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_example, container, false);

        iv = (ImageView) v.findViewById(R.id.eiv);
        tv = (TextView) v.findViewById(R.id.etv);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
        String dat = sp.getString("check", null);
        if (dat.equals("6")) {
            iv.setImageResource(R.drawable.be2);
            tv.setText("");
        }
        if (dat.equals("7")) {
            iv.setImageResource(R.drawable.tve);
            tv.setText("");
        }
        if (dat.equals("8")) {
            iv.setImageResource(R.drawable.ede);
            tv.setText("");
        }
        if (dat.equals("9")) {
            iv.setImageResource(R.drawable.ce1);
            tv.setText("");
        }
        if (dat.equals("10")) {
            iv.setImageResource(R.drawable.vgx);
            tv.setText("");
        }
        if (dat.equals("11")) {
            iv.setImageResource(R.drawable.lx);
            tv.setText("");
        }
        if (dat.equals("12")) {
            iv.setImageResource(R.drawable.dme);
            tv.setText("");
        }
        if (dat.equals("13")) {
            iv.setImageResource(R.drawable.lse);
            tv.setText("");
        }
        if (dat.equals("14")) {
            iv.setImageResource(R.drawable.mpe);
            tv.setText("");
        }
        if (dat.equals("15")) {
            iv.setImageResource(R.drawable.lle);
            tv.setText("");
        }
        if (dat.equals("16")) {
            iv.setImageResource(R.drawable.rle);
            tv.setText("");
        }
        if (dat.equals("17")) {
            iv.setImageResource(R.drawable.tte);
            tv.setText("");
        }
        if (dat.equals("18")) {
            iv.setImageResource(R.drawable.gle);
            tv.setText("");
        }
        if (dat.equals("19")) {
            iv.setImageResource(R.drawable.fle);
            tv.setText("");
        }
        if (dat.equals("20")) {
            iv.setImageResource(R.drawable.gve);
            tv.setText("");
        }
        if(dat.equals("21")){
            iv.setImageResource(R.drawable.de);
            tv.setText("");
        }
        if(dat.equals("22")){
            iv.setImageResource(R.drawable.ave);
            tv.setText("");
        }
        if(dat.equals("23")){
            iv.setImageResource(R.drawable.actve);
            tv.setText("");
        }
        if(dat.equals("24")){
            iv.setImageResource(R.drawable.lve);
            tv.setText("");
        }
        if(dat.equals("25")){
            iv.setImageResource(R.drawable.spe);
            tv.setText("");
        }
        if(dat.equals("26")){
            iv.setImageResource(R.drawable.sple);
            tv.setText("");
        }
        if(dat.equals("27")){
            iv.setImageResource(R.drawable.bre);
            tv.setText("");
        }
        if(dat.equals("28")){
            iv.setImageResource(R.drawable.ine);
            tv.setText("");
        }
        if(dat.equals("29")){
            iv.setImageResource(R.drawable.frx);
            tv.setText("");
        }
        if(dat.equals("30")){
            iv.setImageResource(R.drawable.sqle1);
            tv.setText("");
        }
        if(dat.equals("31")){
            iv.setImageResource(R.drawable.cpe);
            tv.setText("");
        }
    }
}