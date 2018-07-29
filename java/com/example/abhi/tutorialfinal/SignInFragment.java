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


public class SignInFragment extends Fragment {

    public SignInFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_sign_in, container, false);
        TextView tev = (TextView) v.findViewById(R.id.tv);
        final TextView tev1 = (TextView) v.findViewById(R.id.tv1);

        tev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                SignInFragment.this.startActivity(intent);
            }
        });

        Button b = (Button) v.findViewById(R.id.btn);
        final EditText edt1 = (EditText) v.findViewById(R.id.et1);
        final EditText edt2 = (EditText) v.findViewById(R.id.et2);

        b.setOnClickListener(new View.OnClickListener() {
            public Context c1 = getActivity();

            @Override
            public void onClick(View v) {
                SharedPreferences sp = this.c1.getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                String usr = sp.getString("username", "Guest User");
                String pass = sp.getString("password", null);

                String usr_data = edt1.getText().toString();
                String pass_data = edt2.getText().toString();

                if (usr_data.equals(usr) && pass_data.equals(pass)) {
                    Intent i = new Intent(getActivity(), SecondActivity.class);
                    SignInFragment.this.startActivity(i);
                }
                else{
                     tev1.setText("Invalid Username/Password");
                }

            }

            });
        return v;
    }
}

