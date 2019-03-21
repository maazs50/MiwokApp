package com.example.maaz.miwokapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mohammed Maaz S on 09-10-17.
 */

public class FamilyMembers extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.familymembers);
        ArrayList<Word> family=new ArrayList<>();
        family.add(new Word("father","әpә",R.drawable.family_father));
        family.add(new Word("mother","әṭa",R.drawable.family_mother));
        family.add(new Word("son","angsi",R.drawable.family_son));
        family.add(new Word("daughter","tune",R.drawable.family_daughter));
        family.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        family.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
        family.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister));
        family.add(new Word("grandmother","ama",R.drawable.family_grandmother));
        family.add(new Word("grandfather","paapa",R.drawable.family_grandfather));
        ListView familyList=(ListView)findViewById(R.id.familyList);
        WordAdapter wordAdapter=new WordAdapter(this,family,R.color.green);
        familyList.setAdapter(wordAdapter);
    }
}
