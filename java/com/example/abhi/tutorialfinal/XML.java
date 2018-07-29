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


public class XML extends Fragment {

    TextView tv;
    ImageView iv;
    public XML() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_xml, container, false);

        iv = (ImageView) v.findViewById(R.id.xiv);
        tv = (TextView) v.findViewById(R.id.xtv);


        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
        String dat = sp.getString("check",null);
        if(dat.equals("6")){
            iv.setImageResource(R.drawable.bx1);
            tv.setText("");
        }
        if(dat.equals("7")){
            iv.setImageResource(R.drawable.tv1);
            tv.setText("");
        }
        if(dat.equals("8")){
            iv.setImageResource(R.drawable.edtx);
            tv.setText("");
        }
        if(dat.equals("9")){
            iv.setImageResource(R.drawable.cxm1);
            tv.setText("");
        }
        if(dat.equals("10")){
            iv.setImageResource(R.drawable.vgx);
            tv.setText("");
        }
        if(dat.equals("11")){
            iv.setImageResource(R.drawable.lx);
            tv.setText("");
        }
        if(dat.equals("12")){
            iv.setImageResource(R.drawable.dx);
            tv.setText("");
        }
        if(dat.equals("13")){
            iv.setImageResource(R.drawable.lsx);
            tv.setText("");
        }
        if(dat.equals("14")){
            iv.setImageResource(R.drawable.mx);
            tv.setText("");
        }
        if(dat.equals("15")){
            iv.setImageResource(R.drawable.llx);
            tv.setText("");
        }
        if(dat.equals("16")){
            iv.setImageResource(R.drawable.rlx);
            tv.setText("");
        }if(dat.equals("17")){
            iv.setImageResource(R.drawable.ttx);
            tv.setText("");
        }
        if(dat.equals("18")){
            iv.setImageResource(R.drawable.glx);
            tv.setText("");
        }
        if(dat.equals("19")){
            iv.setImageResource(R.drawable.flx);
            tv.setText("");
        }
        if(dat.equals("20")){
            iv.setImageResource(R.drawable.gvj);
            tv.setText("");
        }
        if(dat.equals("21")){
            iv.setImageResource(R.drawable.dx2);
            tv.setText("");
        }
        if(dat.equals("22")){
            iv.setImageResource(R.drawable.avx);
            tv.setText("");
        }
        if(dat.equals("23")){
            iv.setImageResource(R.drawable.actvx);
            tv.setText("");
        }
        if(dat.equals("24")){
            iv.setImageResource(R.drawable.lvj);
            tv.setText("");
        }
        if(dat.equals("25")){
            iv.setImageResource(R.drawable.spj);
            tv.setText("");
        }
        if(dat.equals("26")){
            iv.setImageResource(R.drawable.splx);
            tv.setText("");
        }
        if(dat.equals("27")){
            iv.setImageResource(R.drawable.brx);
            tv.setText("");
        }
        if(dat.equals("28")){
            iv.setImageResource(R.drawable.inx);
            tv.setText("");
        }
        if(dat.equals("29")){
            iv.setImageResource(R.drawable.frx1);
            tv.setText("");
        }
        if(dat.equals("30")){
            iv.setImageResource(R.drawable.sqle);
            tv.setText("");
        }
        if(dat.equals("31")){
            iv.setImageResource(R.drawable.cpx);
            tv.setText("");
        }

    }
}
