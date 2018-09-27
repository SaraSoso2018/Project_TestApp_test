package com.example.es040938.myapplication_2;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ToDo 5 Create a new BodyPartFragment instance and display it using the FragmentManager
        BodyPartFragment headFragment= new  BodyPartFragment();

        headFragment.setmImageIds(AndroidImageAssets.getFlower());
        headFragment.setmListIndex(1);

        //Use FragmentManager and transaction to add the fragment to the screen
        FragmentManager fragmentManager= getSupportFragmentManager();

        //Fragment transaction
        fragmentManager.beginTransaction()
                .add(R.id.head_container,headFragment)
                .commit();


        //Ceate and display the water and earth BodyPartFragments
        BodyPartFragment bodyFragment= new  BodyPartFragment();
        bodyFragment.setmImageIds(AndroidImageAssets.getWater());
        bodyFragment.setmListIndex(1);
        fragmentManager.beginTransaction()
                .add(R.id.body_container, bodyFragment)
                .commit();

        BodyPartFragment footFragment= new  BodyPartFragment();
        footFragment.setmImageIds(AndroidImageAssets.getEarth());
        footFragment.setmListIndex(1);
        fragmentManager.beginTransaction()
                .add(R.id.foot_container, footFragment)
                .commit();


    }//
}
