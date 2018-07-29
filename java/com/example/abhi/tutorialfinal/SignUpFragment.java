package com.example.abhi.tutorialfinal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.content.Context.MODE_PRIVATE;


public class SignUpFragment extends Fragment {

    public SignUpFragment() {
    }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.fragment_sign_up, container, false);

            Button b = (Button) v.findViewById(R.id.btn1);
            final EditText et3 = (EditText) v.findViewById(R.id.et3);
            final EditText et4 = (EditText) v.findViewById(R.id.et4);
            final EditText et5 = (EditText) v.findViewById(R.id.et5);

       b.setOnClickListener(new View.OnClickListener() {

                private Context c1 = getActivity();

                @Override
                public void onClick(View v) {
                    SharedPreferences sp = this.c1.getSharedPreferences("my_sp",MODE_PRIVATE);
                    SharedPreferences.Editor e = sp.edit();
                    String dat = et3.getText().toString();
                    String dat1 = et4.getText().toString();
                    e.putString("username",dat);
                    e.putString("password",dat1);
                    e.apply();
                    String a=et4.getText().toString();
                    String b=et5.getText().toString();
                    if(!(a.equals(b))){
                        et5.setError("Passwords Don't match");
                    }
                    else
                    {
                        Intent i = new Intent(getActivity(), MainActivity.class);
                        SignUpFragment.this.startActivity(i);
                    }

                }

            });

            return v;

        }
    }