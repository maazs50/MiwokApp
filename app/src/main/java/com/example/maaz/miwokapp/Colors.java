package com.example.maaz.miwokapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mohammed Maaz S on 09-10-17.
 */

public class Colors extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colors);
        ArrayList<Word> colors=new ArrayList<Word>();
        colors.add(new Word("red","weṭeṭṭi",R.drawable.color_red));
        colors.add(new Word("green","chokokki",R.drawable.color_green));
        colors.add(new Word("brown","ṭakaakki",R.drawable.color_brown));
        colors.add(new Word("gray","ṭopoppi", R.drawable.color_gray));
        colors.add(new Word("black","kululli",R.drawable.color_black));
        colors.add(new Word("white","kelelli",R.drawable.color_white));
        colors.add(new Word("dusty yellow","ṭopiisә", R.drawable.color_dusty_yellow));
        colors.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));
        ListView listColors=(ListView)findViewById(R.id.colorsList);
        WordAdapter adapter=new WordAdapter(this,colors,R.color.purple);
        listColors.setAdapter(adapter);

    }

}

