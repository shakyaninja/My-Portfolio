package com.example.lujasportfolio.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lujasportfolio.R;
import com.example.lujasportfolio.fragments.Introduction;

public class MainActivity extends AppCompatActivity {
private int fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager().beginTransaction().replace(R.id.container,new Introduction()).commit();
    }
}
