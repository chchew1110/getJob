package com.example.chrisc.bestlineaward;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;


public class LineClickListener implements OnClickListener {
    MainActivity activity;

    public LineClickListener(Context context)
    {
        activity = (MainActivity)context;
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.gline:
                Intent gline_layout = new Intent(activity, family_line.class);
                activity.startActivity(gline_layout);
                break;
            case R.id.resilience:
                Intent resilience_layout = new Intent(activity, family_line.class);
                activity.startActivity(resilience_layout);
                break;


        }
    }
}
