package com.example.chrisc.mariox;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Queue extends Activity{
    ImageButton choose_mario;
    ImageButton choose_bowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.queue);

        choose_mario = (ImageButton) findViewById(R.id.mario);
        choose_mario.setOnClickListener(
                new ImageButton.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent start_mario = new Intent(v.getContext(), mario_p1.class);
                        startActivity(start_mario);
                    }
                }
        );
    }
}
