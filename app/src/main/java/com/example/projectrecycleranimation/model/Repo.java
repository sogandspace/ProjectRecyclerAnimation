package com.example.projectrecycleranimation.model;

import java.util.ArrayList;
import java.util.List;

public class Repo {
    private static Repo mInstance;
    private static List<Movies> mMovies;

    public Repo() {
        mMovies = new ArrayList<>();
        for (int i=0; i<200; i++){
             mMovies.add(new Movies("Title is : " + i
                    , "Subtitle is :" + i));
        }
}
    public static Repo getInstance() {
        if (mInstance == null)
            mInstance = new Repo();
        return mInstance;
    }

    public List<Movies> getMovies() {
        return mMovies;
    }
}
