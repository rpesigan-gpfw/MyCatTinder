package com.example.cattinder.activity;

import com.example.cattinder.R;
import com.example.cattinder.activity.fragment.KittyFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Attach the fragment
        getSupportFragmentManager().beginTransaction().add(R.id.container, new KittyFragment())
                .commit();
    }
}
