package com.demoapp.kirangopakumar.createbodyfragment;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FragmentManager fragmentManager = getSupportFragmentManager();


        BodyPartFragment bodyPartFragment = new BodyPartFragment();


        fragmentManager.beginTransaction().add(R.id.head_fragment_container,bodyPartFragment).commit();





    }
}
