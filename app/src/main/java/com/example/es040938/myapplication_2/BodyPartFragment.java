package com.example.es040938.myapplication_2;

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

    //Variables to store a list of image resourses and the index of the image that this fragment display
    private List<Integer> mImageIds;
    private int mListIndex;
    //Tag for logging
    private static final String TAG = "BodyPartFragment";

//Mandatory constructor for instantiating the fragment
    public BodyPartFragment(){

    }


    //Inflates the fragment layout and sets any image resources
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View rootView= inflater.inflate(R.layout.fragment_body_part, container,false);

        //Get a refrence to the ImageView in the fragment layout
        final ImageView imageView= (ImageView) rootView.findViewById(R.id.body_part_image_view);

        //Set the image to display
      // imageView.setImageResource(AndroidImageAssets.getFlower().get(0));
        if(mImageIds != null){
            imageView.setImageResource(mImageIds.get(mListIndex));
            //if click change image to next image
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mListIndex < mImageIds.size()-1)
                    {
                        mListIndex++;
                    }else{
                        mListIndex=0;
                    }
                    imageView.setImageResource(mImageIds.get(mListIndex));
                }
            });
        }else{
            //log a message saying the image id list is null
            Log.v(TAG, "This fragment has a null list of image id's ");

        }

        //Return root view
        return rootView;
    }

    //Setter methids for kepping track of the list images this fragment can display
    //in the list is currently being display
    public void setmImageIds(List<Integer> imageIds){
        mImageIds = imageIds;
    }
    public void setmListIndex(int index){
        mListIndex = index;
    }


}// End class BodyPartFragment
