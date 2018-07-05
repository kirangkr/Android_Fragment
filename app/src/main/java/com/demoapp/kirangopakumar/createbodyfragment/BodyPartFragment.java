package com.demoapp.kirangopakumar.createbodyfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BodyPartFragment extends Fragment {

    private ImageView image_view;


    //Empty construtor
    public BodyPartFragment(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.body_part_fragment,container,false);

        image_view = (ImageView)rootView.findViewById(R.id.image_view);


        image_view.setImageResource(AndroidAsset.getAllHeads().get(0));



        return rootView;
    }
}
