package com.activity.callback.fragment2;

import android.content.Context;
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
import android.widget.EditText;
import android.widget.TextView;



public class ThirdFragment extends Fragment {
    EditText liketext;
    Button UpdateButton;
    TextView tt;
    @Nullable


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_third, container, false);
        View rootView=inflater.inflate(R.layout.fragment_third,container,false);
        tt=(TextView) rootView.findViewById(R.id.tt);
        UpdateButton=(Button) rootView.findViewById(R.id.updateButton);
        liketext=(EditText) rootView.findViewById(R.id.LikeText);
      UpdateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String second =liketext.getText().toString();
               // String first = fragment.getText().toString();
                Bundle bundle1=new Bundle();
                bundle1.putString("Fragment1",second);
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                FirstFragment firstFragment=new FirstFragment();
                firstFragment.setArguments(bundle1);
                fragmentTransaction.replace(R.id.frame_container,firstFragment);
                fragmentTransaction.commit();

            }
        });
        return rootView;
    }
}




