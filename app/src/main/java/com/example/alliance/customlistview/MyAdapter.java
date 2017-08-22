package com.example.alliance.customlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Alliance on 8/22/2017.
 */

class MyAdapter extends ArrayAdapter {
    int [] imageArray;
    String[] titleArray;
    String[] desArray;

    public MyAdapter(Context context, String[] titles1, String [] des1, int[] imag1){
        //overriding default constructor off array adapter
        super(context, R.layout.cuslistview_row, R.id.titleTextView,titles1);
        this.imageArray =imag1;
        this.titleArray = titles1;
        this.desArray =des1;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //inflating the Layout
        LayoutInflater inflater = (LayoutInflater)getContext().
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.cuslistview_row,parent,false);

        //get the reference to the view objects
        ImageView myImage = (ImageView)row.findViewById(R.id.imageView);
        TextView myTilte = (TextView)row.findViewById(R.id.titleTextView);
        TextView myDes = (TextView)row.findViewById(R.id.descripTextView);

        //providing the element of an array by specifying its position

        myImage.setImageResource(imageArray[position]);
        myTilte.setText(titleArray[position]);
        myDes.setText(desArray[position]);
        return row;
    }
}