package com.example.chrisc.bestlineaward;

import Listeners.*;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomArrayAdapter<T> extends ArrayAdapter<T> {
    public CustomArrayAdapter(Context context, T[] objects)
    {
        super(context, android.R.layout.simple_spinner_item, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v = super.getView(position, convertView, parent);

        ((TextView)v).setTextColor(Color.WHITE);


        return v;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent)
    {
        View view = super.getView(position, convertView, parent);

        TextView text = (TextView)view.findViewById(android.R.id.text1);
        text.setBackgroundColor(Color.BLACK);
        text.setTextColor(Color.WHITE);

        return view;
    }
}
