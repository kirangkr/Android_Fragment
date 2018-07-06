package com.demoapp.kirangopakumar.createbodyfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class BodyPartFragment extends Fragment {


    private static final String TAG = "BodyPartFragment";

    private ImageView image_view;
    private List<Integer> mImages;

    private int mIndex;


    public static final String LIST_INDEX_KEY = "list_index";
    public static final String IMAGES_LIST_KEY = "images_list";


    //Empty construtor
    public BodyPartFragment(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if(savedInstanceState != null){
            mIndex = savedInstanceState.getInt(LIST_INDEX_KEY);
            mImages = savedInstanceState.getIntegerArrayList(IMAGES_LIST_KEY);

        }

        View rootView = inflater.inflate(R.layout.body_part_fragment,container,false);

        image_view = (ImageView)rootView.findViewById(R.id.image_view);

        if(mImages != null){
            image_view.setImageResource(mImages.get(mIndex));
            image_view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mIndex < (mImages.size()-1) ) {
                        mIndex++;
                        image_view.setImageResource(mImages.get(mIndex));
                    }
                    else {
                        mIndex = 0;
                    }
                }

        }

            );
        }else{
            Log.v(TAG,"This fragment has null list if images id's");
        }





        return rootView;
    }

    public void setImageToImageView(List<Integer> allImages) {
        mImages = allImages;
    }


    public void setIndex(int index){
        mIndex = index;
    }



    @Override
    public void onSaveInstanceState(@NonNull Bundle currentState) {

        currentState.putInt(LIST_INDEX_KEY, mIndex);
        currentState.putIntegerArrayList(IMAGES_LIST_KEY, (ArrayList<Integer>) mImages);
    }

}
