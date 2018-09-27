package com.example.es040938.myapplication_2;

import java.util.ArrayList;
import java.util.List;

public class AndroidImageAssets {

    //List for all Android images

//flower
    private static final List<Integer> flower = new ArrayList<Integer>() {{
    add(R.drawable.flower1);
        add(R.drawable.flower2);
        add(R.drawable.flow3);
        add(R.drawable.flower4);
    }};
    //water
    private static final List<Integer> water = new ArrayList<Integer>() {{
        add(R.drawable.water1);
        add(R.drawable.water2);
        add(R.drawable.wat3);
        add(R.drawable.water4);
    }};
    //earth
    private static final List<Integer> earth = new ArrayList<Integer>() {{
        add(R.drawable.earth1);
        add(R.drawable.earth2);
        add(R.drawable.earth3);
        add(R.drawable.eart4);
    }};

    private static final List<Integer> all = new ArrayList<Integer>(){{
        addAll(flower);
        addAll(water);
        addAll(earth);
    }};


    //Getter methods that return of all head images, body images, and leg images
    public static List<Integer> getFlower(){return flower;}
    public static List<Integer> getWater(){return water;}
    public static List<Integer> getEarth(){return earth;}

    //Return list of all the images
    public static List<Integer> getAll(){return all;}




}// End class AndroidImageAssets
