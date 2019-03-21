package com.example.maaz.miwokapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mohammed Maaz S on 09-10-17.
 */

public class Numbers extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Display the layout
        setContentView(R.layout.numbers);
        //Create  an array of words
        ArrayList<Word> list=new ArrayList<>();// Word constructor consits of 2 parameters

        Word w=new Word("One", "lutti",R.drawable.number_one); //Create an object
        list.add(w); // pass the object
        list.add(new Word("two","otika",R.drawable.number_two));// easy way without creating an object
        list.add(new Word("three","tolookosu",R.drawable.number_three));
        list.add(new Word("four","oyyisa",R.drawable.number_four));
        list.add(new Word("five","moossoka",R.drawable.number_five));
        list.add(new Word("six ","timmoka",R.drawable.number_six));
        list.add(new Word("seven","kenekaku",R.drawable.number_seven));
        list.add(new Word("eight","kawinta",R.drawable.number_eight));
        list.add(new Word("nine","wo'e",R.drawable.number_nine));
        list.add(new Word("ten","na'aacha",R.drawable.number_ten));


//     GridView listView=(GridView) findViewById(R.id.list);
        ListView listView=(ListView) findViewById(R.id.list);

        WordAdapter adapter=new WordAdapter(this,list,R.color.orange);
        listView.setAdapter(adapter);
    }
}
