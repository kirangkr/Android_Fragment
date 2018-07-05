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

import java.util.List;

public class BodyPartFragment extends Fragment {


    private static final String TAG = "BodyPartFragment";

    private ImageView image_view;
    private List<Integer> mImages;


    private int mIndex;


    //Empty construtor
    public BodyPartFragment(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.body_part_fragment,container,false);

        image_view = (ImageView)rootView.findViewById(R.id.image_view);

        if(mImages != null){
            image_view.setImageResource(mImages.get(mIndex));
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





}
