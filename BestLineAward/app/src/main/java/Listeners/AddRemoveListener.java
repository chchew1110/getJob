package Listeners;

import com.example.chrisc.bestlineaward.*;
import android.content.Context;
import android.view.View;

public class AddRemoveListener implements View.OnClickListener {

    FamilyLine activity;

    public AddRemoveListener(Context context)
    {
        activity = (FamilyLine) context;
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.add_button:
                activity.add_members();
                break;
            case R.id.remove_button:
                activity.removeMember();
                break;
        }

    }
}
