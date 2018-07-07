package com.demoapp.kirangopakumar.createbodyfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;

public class MasterListFragment extends Fragment {

    private GridView images_grid_view;



    ///Empty constructor
    public MasterListFragment(){

    }


    //Define a new interface OnImageClickListener that triggers a callback in the host Activity(AndroidMeActivity)
    OnImageClickListener mCallback;



    //OnImageClickListener interface , calls  a method  in the host Acitivity(AndroidMeActivity) named onImageSeleceted
    public interface OnImageClickListener{

        void onImageSeleceted(int position);

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //This makes sure  that host Acitivity has implemented  the callback method
        //If not, it throws an exception

        try{
            mCallback = (OnImageClickListener) context;
        }catch (ClassCastException ce){
            throw new ClassCastException(context.toString() + "  must implement OnImageClickListerner");

        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View roootView = inflater.inflate(R.layout.master_list_fragment,container,false);

        images_grid_view = (GridView) roootView.findViewById(R.id.images_grid_view);


        //To diplay all immages in gridview, we need to create an adapter class

        MasterListAdapter masterListAdapter = new MasterListAdapter(getContext(),AndroidAsset.getAll());


        //setting the adapter to GridView
        images_grid_view.setAdapter(masterListAdapter);

        images_grid_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //T
                mCallback.onImageSeleceted(position);

            }
        });

        return roootView;
    }
}
