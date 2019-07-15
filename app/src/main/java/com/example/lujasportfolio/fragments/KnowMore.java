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

public class KnowMore extends Fragment {
private Button Projects;
private Button Hobbiees;
private Button Contributions;
    private Button Researches;
    private Button Arts;
    private Button Travels;
    private FragmentManager fragmentManager;
    public KnowMore() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.knowmore_fragment, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Researches= view.findViewById(R.id.researches);
        Projects= view.findViewById(R.id.project);
        Hobbiees= view.findViewById(R.id.hobbies);
        Contributions= view.findViewById(R.id.contributions);
        Arts= view.findViewById(R.id.arts);
        Travels= view.findViewById(R.id.travels);
        fragmentManager= getFragmentManager();
        Projects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(String.valueOf(true))
                        .replace(R.id.container,new ProjectList())
                        .commit();
            }
        });
        Researches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(String.valueOf(true))
                        .replace(R.id.container,new ProjectList())
                        .commit();
            }
        });
        Hobbiees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(String.valueOf(true))
                        .replace(R.id.container,new ProjectList())
                        .commit();
            }
        });
        Travels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(String.valueOf(true))
                        .replace(R.id.container,new ProjectList())
                        .commit();
            }
        });
        Arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(String.valueOf(true))
                        .replace(R.id.container,new ProjectList())
                        .commit();
            }
        });
        Contributions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(String.valueOf(true))
                        .replace(R.id.container,new ProjectList())
                        .commit();
            }
        });


    }
}
