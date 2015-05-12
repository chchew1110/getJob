package com.example.chrisc.bestlineaward;


import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class family_line extends ActionBarActivity{
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
    private List<TextView> totalView = new ArrayList<TextView>();

    ArrayList<Members> list_of_members = new ArrayList<Members>();



     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family_line);

        Button back_button = (Button) findViewById(R.id.back_button);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main_menu = new Intent(v.getContext(), MainActivity.class);
                startActivity(main_menu);

            }
        });

        Button add_button = (Button) findViewById(R.id.add_button);
        Button remove_button = (Button) findViewById(R.id.remove_button);



        AddRemoveListener arl = new AddRemoveListener(this);

        add_button.setOnClickListener(arl);
        remove_button.setOnClickListener(arl);

        if(savedInstanceState != null)
        {
            initializeView(savedInstanceState);
        }

    }

    public void initializeView(Bundle savedInstanceState)
    {

    }

    public void add_members()
    {

        LinearLayout name_layout = (LinearLayout) findViewById(R.id.namelayout);
        LinearLayout leadership_layout = (LinearLayout) findViewById(R.id.leadershiplayout);
        LinearLayout fellowship_layout = (LinearLayout) findViewById(R.id.fellowshiplayout);
        LinearLayout service_layout = (LinearLayout) findViewById(R.id.servicelayout);
        LinearLayout total_layout = (LinearLayout) findViewById(R.id.totallayout);

        EditText name_text = new EditText(this);
        EditText leadership_text = new EditText(this);
        EditText fellowship_text = new EditText(this);
        EditText service_text = new EditText(this);
        EditText total_text = new EditText(this);

        name_text.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        name_text.setText("I added new View");
        name_text.setTextColor(Color.WHITE);
        name_layout.addView(name_text);

        list_of_members.add(new Members());

    }


    @Override
    protected void onSaveInstanceState(Bundle outstate)
    {
        super.onSaveInstanceState(outstate);




    }



}
