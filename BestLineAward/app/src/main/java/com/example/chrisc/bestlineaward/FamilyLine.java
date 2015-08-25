package com.example.chrisc.bestlineaward;

import Listeners.*;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class FamilyLine extends ActionBarActivity {
    //For storing the inputted values in a array; the key
    private static final String SAVED_NAME_ARRAY = "NAME_ARRAY";
    private static final String SAVED_LEADERSHIP_ARRAY = "LEADERSHIP_ARRAY";
    private static final String SAVED_FELLOWSHIP_ARRAY = "FELLOWSHIP_ARRAY";
    private static final String SAVED_SERVICE_ARRAY = "SERVICE_ARRAY";
    private static final String SAVED_TOTAL_ARRAY = "TOTAL_ARRAY";
    private static final String SAVED_TOTAL_LINE_ARRAY = "TOTAL_LINE_ARRAY";

    //For storing the Views that were created when added members
    private List<EditText> nameView = new ArrayList<EditText>();
    private List<EditText> leadershipView = new ArrayList<EditText>();
    private List<EditText> fellowshipView = new ArrayList<EditText>();
    private List<EditText> serviceView = new ArrayList<EditText>();
    private List<EditText> totalView = new ArrayList<EditText>();

    public ArrayList<Members> list_of_members = new ArrayList<Members>();

    //Variable and View to store the total of the whole line
    public static Double line_total;
    public static TextView total_line;

    //View for storing each member's total contribution
    public List<EditText> total_text = new ArrayList<EditText>();

    public int id_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family_line);

        //ID for the EditTexts have to be 1
        id_count = 1;
        line_total = 0.0;

        Button back_button = (Button) findViewById(R.id.back_button);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main_menu = new Intent(v.getContext(), MainActivity.class);
                startActivity(main_menu);

            }
        });

        TextView line_name = (TextView) findViewById(R.id.LineName);

        Button add_button = (Button) findViewById(R.id.add_button);
        Button remove_button = (Button) findViewById(R.id.remove_button);

        total_line = (TextView) findViewById(R.id.TheTotalNum);
        total_line.setText(line_total.toString());

        AddRemoveListener arl = new AddRemoveListener(this);

        add_button.setOnClickListener(arl);
        remove_button.setOnClickListener(arl);



    }

    public void add_members()
    {

        LinearLayout name_layout = (LinearLayout) findViewById(R.id.namelayout);
        LinearLayout membership_layout = (LinearLayout) findViewById(R.id.statuslayout);
        LinearLayout leadership_layout = (LinearLayout) findViewById(R.id.leadershiplayout);
        LinearLayout fellowship_layout = (LinearLayout) findViewById(R.id.fellowshiplayout);
        LinearLayout service_layout = (LinearLayout) findViewById(R.id.servicelayout);
        LinearLayout total_layout = (LinearLayout) findViewById(R.id.totallayout);

        EditText name_text = new EditText(this);
        EditText leadership_text = new EditText(this);
        EditText fellowship_text = new EditText(this);
        EditText service_text = new EditText(this);
        total_text.add(id_count-1, new EditText(this));


        list_of_members.add(id_count-1, new Members());

        name_text.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        name_text.setText("Enter name");
        name_text.setTextColor(Color.WHITE);
        name_text.setId(id_count);
        name_layout.addView(name_text);

        Spinner status_spin = new Spinner(this);
        status_spin.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 125));
        status_spin.setId(id_count);
        String[] membership = getResources().getStringArray(R.array.membership_array);
        ArrayAdapter<CharSequence> mAdapter = new CustomArrayAdapter<CharSequence>(this, membership);
        status_spin.setAdapter(mAdapter);
        status_spin.setOnItemSelectedListener(new MembershipSpinnerListener(this, id_count-1));
        membership_layout.addView(status_spin);

        leadership_text.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        leadership_text.setText("0");
        leadership_text.setTextColor(Color.WHITE);
        leadership_text.setId(id_count);
        leadership_text.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        LeadershipTextListener leadership_listener = new LeadershipTextListener(this, id_count-1, leadership_text);
        leadership_text.addTextChangedListener(leadership_listener);
        leadership_layout.addView(leadership_text);

        fellowship_text.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        fellowship_text.setText("0");
        fellowship_text.setTextColor(Color.WHITE);
        fellowship_text.setId(id_count);
        fellowship_text.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        FellowshipTextListener fellowship_listener = new FellowshipTextListener(this, id_count-1, fellowship_text);
        fellowship_text.addTextChangedListener(fellowship_listener);
        fellowship_layout.addView(fellowship_text);

        service_text.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        service_text.setText("0");
        service_text.setTextColor(Color.WHITE);
        service_text.setId(id_count);
        service_text.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        ServiceTextListener service_listener = new ServiceTextListener(this, id_count-1, service_text);
        service_text.addTextChangedListener(service_listener);
        service_layout.addView(service_text);

        total_text.get(id_count-1).setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        total_text.get(id_count-1).setText("0");
        total_text.get(id_count-1).setTextColor(Color.WHITE);
        total_text.get(id_count-1).setId(id_count);
        total_text.get(id_count-1).setKeyListener(null);
        total_layout.addView(total_text.get(id_count-1));



        id_count++;

    }

    public void removeMember()
    {

        if(id_count > 1)
        {
            id_count--;
            if(id_count != 0)
            {
                LinearLayout name_layout = (LinearLayout) findViewById(R.id.namelayout);
                LinearLayout membership_layout = (LinearLayout) findViewById(R.id.statuslayout);
                LinearLayout leadership_layout = (LinearLayout) findViewById(R.id.leadershiplayout);
                LinearLayout fellowship_layout = (LinearLayout) findViewById(R.id.fellowshiplayout);
                LinearLayout service_layout = (LinearLayout) findViewById(R.id.servicelayout);
                LinearLayout total_layout = (LinearLayout) findViewById(R.id.totallayout);

                name_layout.removeViewAt(id_count);
                membership_layout.removeViewAt(id_count);
                leadership_layout.removeViewAt(id_count);
                fellowship_layout.removeViewAt(id_count);
                service_layout.removeViewAt(id_count);
                total_layout.removeViewAt(id_count);

                list_of_members.remove(id_count-1);
            }
        }
        calculateTotal();
    }

    //Calculating the total row depending on the member's membership status
    public void calculateTotalRow(int id)
    {
        Double l;
        Double f;
        Double s;
        Double total = 0.0;
        if(list_of_members.get(id).getStatus().equals("Active"))
        {
            l = list_of_members.get(id).getLeadership()-8.0;
            f = list_of_members.get(id).getFellowship()-10.0;
            s = list_of_members.get(id).getService()-20.0;

            total = l+f+s;

            list_of_members.get(id).setTotal(total);
            total_text.get(id).setText(total.toString());
            calculateTotal();


        }
        else
        {
            l = list_of_members.get(id).getLeadership()-4.0;
            f = list_of_members.get(id).getFellowship()-8.0;
            s = list_of_members.get(id).getService()-15.0;

            total = l+f+s;

            list_of_members.get(id).setTotal(total);
            total_text.get(id).setText(total.toString());
            calculateTotal();
        }
    }

    public void calculateTotal()
    {
        int size = list_of_members.size();

        line_total = 0.0;

        for(int i = 0; i < size; i++)
        {
            line_total += list_of_members.get(i).getTotal();
        }

        line_total /= size;
        total_line.setText(line_total.toString());
    }





}
