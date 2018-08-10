package com.activity.callback.fragment2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.view.LayoutInflater;


public class FirstFragment extends Fragment {
    Button OnclickButton;
    TextView firstText;
    TextView thirdText;

    @Nullable


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_first, container, false);

        firstText = (TextView) rootView.findViewById(R.id.firsttext);
        thirdText = (TextView) rootView.findViewById(R.id.thirdtext);
        // firstText.setText(xyz);

        // Bundle bundle= getIntent().getExtras();
        Bundle bundle = getArguments();
        Bundle bundle1=getArguments();
        if (bundle != null) {
            String xyz = bundle.getString("Fragment");
            firstText.setText("hello" + " " + " " + xyz);

        } else {

        }
        if (bundle1!= null) {
            String abc=bundle1.getString("Fragment1");
            thirdText.setText("You like" +" " + " "+ abc);
        } else {

        }
         //Bundle bundle1=getArguments();

        // String xyz= bundle.getString("Fragment");

        OnclickButton = (Button) rootView.findViewById(R.id.submitButton);
        OnclickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SecondFragment secondFragment = new SecondFragment();
                fragmentTransaction.replace(R.id.frame_container, secondFragment);
                fragmentTransaction.commit();
                // Bundle bundle=getArguments();

                ;

            }

        });


OnclickButton.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View view) {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ThirdFragment thirdFragment = new ThirdFragment();
        fragmentTransaction.replace(R.id.frame_container, thirdFragment);
        fragmentTransaction.commit();
        return false;
    }



    });
return rootView;
    }


}



