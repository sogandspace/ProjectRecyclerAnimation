package com.example.projectrecycleranimation.model;

public class Movies {

    private String mTitle, mSub ;

    public Movies(String title, String sub) {
        setTitle(title);
        setSub(sub);
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getSub() {
        return mSub;
    }

    public void setSub(String sub) {
        mSub = sub;
    }

}
