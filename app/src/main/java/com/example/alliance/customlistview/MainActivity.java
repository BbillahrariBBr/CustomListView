package com.example.alliance.customlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String [] titles = {"title1","title2","title3","title4","title5","title6","title7"};
    String []description = {"des1","des2","des3","des4","des5","des6","des7"};
    int [] images = {R.mipmap.ic_launcher,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher,
            R.mipmap.ic_launcher_round ,R.mipmap.ic_launcher,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher};
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.idListview);
        MyAdapter adapter = new MyAdapter(this,titles,description,images);
        lv.setAdapter(adapter);
    }
}

//class MyAdapter extends ArrayAdapter {
//    int [] imageArray;
//    String[] titleArray;
//    String[] desArray;
//
//    public MyAdapter(Context context, String[] titles1, String [] des1, int[] imag1){
//        //overriding default constructor off array adapter
//        super(context, R.layout.cuslistview_row, R.id.titleTextView,titles1);
//        this.imageArray =imag1;
//        this.titleArray = titles1;
//        this.desArray =des1;
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        //inflating the Layout
//        LayoutInflater inflater = (LayoutInflater)getContext().
//                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View row = inflater.inflate(R.layout.cuslistview_row,parent,false);
//
//        //get the reference to the view objects
//        ImageView myImage = (ImageView)row.findViewById(R.id.imageView);
//        TextView myTilte = (TextView)row.findViewById(R.id.titleTextView);
//        TextView myDes = (TextView)row.findViewById(R.id.descripTextView);
//
//        //providing the element of an array by specifying its position
//
//        myImage.setImageResource(imageArray[position]);
//        myTilte.setText(titleArray[position]);
//        myDes.setText(desArray[position]);
//        return row;
//    }
//}


