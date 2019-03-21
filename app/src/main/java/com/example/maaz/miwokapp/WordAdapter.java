package com.example.maaz.miwokapp;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mohammed Maaz S on 14-10-17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    int color;
    public WordAdapter(Activity context, ArrayList<Word> word,int color ) {
        super(context, 0, word);
       this.color=color;
    }

    @Override
//is called when listView tries to display the items at a given position
    public View getView(int position, View convertView, ViewGroup parent) {
        Word getWord = getItem(position);
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listItemView = inflater.inflate(R.layout.list_numbers, parent, false);
        // The views below are added to the list decalared in the above list
        TextView mivok = (TextView) listItemView.findViewById(R.id.miwokId);
        mivok.setText(getWord.getmMiwokTranslation());

        TextView english = (TextView) listItemView.findViewById(R.id.englishId);
        english.setText(getWord.getmDefaultTranslation());

        ImageView image=(ImageView)listItemView.findViewById(R.id.imageView);
//this method checks if object of Word class consists of an object, this is declared in Word class

        if(getWord.hasImage()) {
            image.setImageResource(getWord.getImageResourceId());
        }
        else
        {
            image.setVisibility(View.GONE);
            }

            //Sets the color of background
        View viewContainer =listItemView.findViewById(R.id.container);

        int colour= ContextCompat.getColor(getContext(),color);
        viewContainer.setBackgroundColor(colour);
            return listItemView;
    }

}
