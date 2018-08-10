package com.activity.callback.fragment2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;



public class SecondFragment extends Fragment {
    EditText fragment;
    Button submitButton;

    @Nullable


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_second, container, false);
        final View rootView=inflater.inflate(R.layout.fragment_second,container,false);
        fragment = (EditText) rootView.findViewById(R.id.fragment);

        submitButton = (Button) rootView.findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String first = fragment.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("Fragment", first);
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FirstFragment firstFragment = new FirstFragment();
                firstFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.frame_container, firstFragment);
                fragmentTransaction.commit();

            }
        });

        return rootView;
    }


}