package com.demoapp.kirangopakumar.createbodyfragment;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;


//Custom adapter class that display a lsit of Android images in GridView
public class MasterListAdapter extends BaseAdapter {

    private List<Integer> mAllImagesIds;
    private Context mContext;



    //Constructor
    public MasterListAdapter(Context context, List<Integer> allImages){
        mAllImagesIds = allImages;
        mContext = context;


    }

    @Override
    public int getCount() {
        int count = mAllImagesIds.size();
        return count;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {


        ImageView imageView;

        if(view == null) {
            //If the view is not recycled, this creates a new ImageView to hold an image
            imageView = new ImageView(mContext);

            //defined the imageView properties
            imageView.setPadding(8, 8, 8, 8);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setAdjustViewBounds(true);

        }else{
            imageView = (ImageView) view;
        }



        imageView.setImageResource(mAllImagesIds.get(position));

        return imageView;
    }
}
