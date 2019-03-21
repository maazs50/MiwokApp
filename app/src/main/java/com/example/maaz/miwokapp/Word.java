package com.example.maaz.miwokapp;

/**
 * Created by Mohammed Maaz S on 11-10-17.
 */

public class Word  {

    String mDefaultTranslation,mMiwokTranslation;
    private static final int NO_IMAGE=-1;
    int ImageResourceId=NO_IMAGE;


    public int getImageResourceId() {
        return ImageResourceId;
    }


    public Word(String defaultTranslation,String miwokTranslation,int image){
mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        this.ImageResourceId=image;

    }

    public Word(String defaultTranslation,String miwokTranslation){ // this is used by some other class so there needs to be a difference constructor
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;

    }



    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
public boolean hasImage(){
    return ImageResourceId!=NO_IMAGE;
}
}
