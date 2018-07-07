package com.demoapp.kirangopakumar.createbodyfragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


//This activity is responsible for displaying the master list of all images
//This implements the MasterListFragment callback , OnImageClickListener
public class AndroidMeActivity extends AppCompatActivity implements MasterListFragment.OnImageClickListener {


    //Variables to store the values for the list index of the selected image
    //The default value will be index = 0

    private int headIndex;
    private int bodyIndex;
    private int legIndex;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_me);


    }

    @Override
    public void onImageSeleceted(int position) {
        //Create a Toast that dilpalys the position that was clicked
        Toast.makeText(this, "Postion clicked = " + position, Toast.LENGTH_SHORT).show();

        //Based on where a user has clicked, store the selected list index for the head, body, and leg BodyPartFragment

        //bodyPartNumber will be = 0  for the head fragment, 1 for the body, and 2 for the leg fragment

        //Dividing by 12 give us these integer values because each list of images has size of 12
        int bodyPartNumber = position / 12;

        int listIndex = position - 12 * bodyPartNumber;


        switch (bodyPartNumber) {
            case 0:
                headIndex = listIndex;
                break;
            case 1:
                bodyIndex = listIndex;
                break;
            case 2:
                legIndex = listIndex;
                break;
            default:
                break;
        }


        //Put this information in a Bundle and attach it to an intent that will launch MainActivity
        Bundle b = new Bundle();
        b.putInt("headIndex",headIndex);
        b.putInt("bodyIndex",bodyIndex);
        b.putInt("legIndex",legIndex);


        //Attach the Bundle to an Intent
        final Intent intent = new Intent(AndroidMeActivity.this,MainActivity.class);

        intent.putExtras(b);

        //The "Next" button launches the MainActivity
        Button next_button = (Button) findViewById(R.id.next_button);
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });






    }
}

//1. We need to create master_list_fragment.xml -> GirdView

//2. Created MasterListFragment.java and create empty construstor and inflated the layout, got id of gridview and created MasterListAdapter
// setting the adapter to gridview


//3. MasterListAdapter.java


//4. Created AndroidMeActivity.java and create the android_me.xml layout

//5. Fragment to Fra