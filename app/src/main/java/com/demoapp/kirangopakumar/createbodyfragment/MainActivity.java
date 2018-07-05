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

        BodyPartFragment headPartFragment = new BodyPartFragment();
        headPartFragment.setImageToImageView(AndroidAsset.getAllHeads());
        headPartFragment.setIndex(0);
        fragmentManager.beginTransaction().add(R.id.head_fragment_container,headPartFragment).commit();


        BodyPartFragment bodyPartFragment = new BodyPartFragment();
        bodyPartFragment.setImageToImageView(AndroidAsset.getAllBodies());
        bodyPartFragment.setIndex(0);
        fragmentManager.beginTransaction().add(R.id.body_fragment_container,bodyPartFragment).commit();


        BodyPartFragment legPartFragment = new BodyPartFragment();
        legPartFragment.setImageToImageView(AndroidAsset.getAllLegs());
        legPartFragment.setIndex(0);
        fragmentManager.beginTransaction().add(R.id.leg_fragment_container,legPartFragment).commit();



    }
}
