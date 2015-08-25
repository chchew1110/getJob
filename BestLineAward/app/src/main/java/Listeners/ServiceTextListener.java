package Listeners;

import com.example.chrisc.bestlineaward.*;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class ServiceTextListener implements TextWatcher
{
    FamilyLine line;
    int id;
    EditText edit;
    Double service;
    public ServiceTextListener(Context context, int id_count, EditText ed)
    {
        line = (FamilyLine) context;
        id = id_count;
        edit = ed;
        service = 0.0;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after)
    {

    }
    // Convert the text to a double and add it to the respective member
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count)
    {
        edit.removeTextChangedListener(this);

        String newString = s.toString();

        try
        {
            service = Double.parseDouble(newString);
        }
        catch(NumberFormatException e)
        {
            service = 0.0;
        }

        edit.addTextChangedListener(this);
    }

    //After text change, calculate the total for both the row and the whole total.
    @Override
    public void afterTextChanged(Editable s)
    {
        line.list_of_members.get(id).setService(service);
        line.calculateTotalRow(id);
    }
}
