package com.demoapp.kirangopakumar.createbodyfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


//This activity is responsible for displaying the master list of all images
//This implements the MasterListFragment callback , OnImageClickListener
public class AndroidMeActivity extends AppCompatActivity implements MasterListFragment.OnImageClickListener{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_me);




    }

    @Override
    public void onImageSeleceted(int position) {
        //Create a Toast that dilpalys the position that was clicked
        Toast.makeText(this, "Postion clicked = " + position,Toast.LENGTH_SHORT).show();

        //Based on where

    }
}

//1. We need to create master_list_fragment.xml -> GirdView

//2. Created MasterListFragment.java and create empty construstor and inflated the layout, got id of gridview and created MasterListAdapter
// setting the adapter to gridview




//3. MasterListAdapter.java


//4. Created AndroidMeActivity.java and create the android_me.xml layout

//5. Fragment to Fra