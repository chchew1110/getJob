package com.example.chrisc.bestlineaward;

import Listeners.*;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity {

    public Button G_line_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        G_line_button = (Button) findViewById(R.id.gline);
        Button Resilience_button = (Button) findViewById(R.id.resilience);

        LineClickListener line_click = new LineClickListener(this);

        G_line_button.setOnClickListener(line_click);
        Resilience_button.setOnClickListener(line_click);


    }



}
