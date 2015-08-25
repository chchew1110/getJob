package Listeners;

import com.example.chrisc.bestlineaward.*;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;


public class MembershipSpinnerListener implements OnItemSelectedListener {

    FamilyLine activity;
    Members member = new Members();
    int id_count;

    public MembershipSpinnerListener(Context context, int id)
    {
        activity = (FamilyLine)context;
        id_count = id;
    }

    @Override
    public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id)
    {
        if(position == 0)
        {
            member.setStatus("Active");
            activity.list_of_members.set(id_count, member);
            activity.calculateTotalRow(id_count);
            //System.out.println(activity.list_of_members.get(id_count).getStatus());
        }
        else if(position == 1)
        {
            member.setStatus("Associate");
            activity.list_of_members.set(id_count, member);
            activity.calculateTotalRow(id_count);
            //System.out.println(activity.list_of_members.get(id_count).getStatus());
        }

        else if(position == 2)
        {
            member.setStatus("Pledge");
            activity.list_of_members.set(id_count, member);
            activity.calculateTotalRow(id_count);
            //System.out.println(activity.list_of_members.get(id_count).getStatus());
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parentView)
    {

    }
}
