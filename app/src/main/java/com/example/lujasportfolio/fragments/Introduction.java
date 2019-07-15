package com.example.lujasportfolio.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lujasportfolio.R;

public class Introduction extends Fragment {
    private Button Knowmore;
    private FragmentManager fragmentManager;
    public Introduction() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.introduction_fragment, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Knowmore = view.findViewById(R.id.knowme);
        fragmentManager= getFragmentManager();
        Knowmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(String.valueOf(true))
                        .replace(R.id.container,new KnowMore())
                        .commit();
            }
        });
    }
}
