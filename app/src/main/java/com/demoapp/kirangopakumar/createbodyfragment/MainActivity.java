package com.demoapp.kirangopakumar.createbodyfragment;


import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();


        if(savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();

            BodyPartFragment headPartFragment = new BodyPartFragment();
            headPartFragment.setImageToImageView(AndroidAsset.getAllHeads());
            int headIndex = intent.getIntExtra("headIndex",0);
            headPartFragment.setIndex(headIndex);
            fragmentManager.beginTransaction().add(R.id.head_fragment_container, headPartFragment).commit();


            BodyPartFragment bodyPartFragment = new BodyPartFragment();
            bodyPartFragment.setImageToImageView(AndroidAsset.getAllBodies());
            int bodyIndex = intent.getIntExtra("bodyIndex",0);
            bodyPartFragment.setIndex(bodyIndex);
            fragmentManager.beginTransaction().add(R.id.body_fragment_container, bodyPartFragment).commit();


            BodyPartFragment legPartFragment = new BodyPartFragment();
            legPartFragment.setImageToImageView(AndroidAsset.getAllLegs());
            int legIndex = intent.getIntExtra("legIndex",0);
            legPartFragment.setIndex(legIndex);
            fragmentManager.beginTransaction().add(R.id.leg_fragment_container, legPartFragment).commit();
        }


    }
}
