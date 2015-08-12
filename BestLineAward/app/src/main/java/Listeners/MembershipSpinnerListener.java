package Listeners;

import com.example.chrisc.bestlineaward.*;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;


public class MembershipSpinnerListener implements AdapterView.OnItemSelectedListener {

    FamilyLine activity;
    Members member = new Members();

    public MembershipSpinnerListener(Context context)
    {
        activity = (FamilyLine)context;
    }

    @Override
    public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id)
    {
        if(position == 0)
        {
            member.setStatus("Active");
            activity.list_of_members.set(activity.id_count, member);
        }
        else if(position == 1)
        {
            member.setStatus("Associate");
            activity.list_of_members.set(activity.id_count, member);
        }

        else if(position == 2)
        {
            member.setStatus("Pledge");
            activity.list_of_members.set(activity.id_count, member);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parentView)
    {

    }
}
