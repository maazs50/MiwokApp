package com.example.maaz.miwokapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mohammed Maaz S on 09-10-17.
 */

public class Phrases extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phrases);
        ArrayList<Word> phrases=new ArrayList<>();
        phrases.add(new Word("What is your name?","tinnә oyaase'nә"));
        phrases.add(new Word("My name is...","oyaaset..."));
        phrases.add(new Word("Let’s go.","yoowutis"));
        phrases.add(new Word("Come here.","әnni'nem"));
        phrases.add(new Word("I’m coming.","әәnәm"));
        phrases.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        phrases.add(new Word("Are you coming?","әәnәs'aa?"));
        phrases.add(new Word("I’m feeling good.","kuchi achit"));
        phrases.add(new Word("How are you feeling?","michәksәs?"));

WordAdapter adapter=new WordAdapter(this,phrases,R.color.blue);
        ListView list=(ListView)findViewById(R.id.phrasesList);
        list.setAdapter(adapter);


    }
}
