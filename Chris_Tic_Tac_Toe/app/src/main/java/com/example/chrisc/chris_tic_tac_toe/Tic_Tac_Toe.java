package com.example.chrisc.chris_tic_tac_toe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;


public class Tic_Tac_Toe extends ActionBarActivity {

    //Initialize all variables
    boolean player1_turn;
    boolean player2_turn;
    boolean player1_win;
    boolean player2_win;
    boolean tie;
    int[][] tic_tac_toe = new int[3][3];
    ImageButton top_left;
    ImageButton top_middle;
    ImageButton top_right;
    ImageButton middle_left;
    ImageButton middle;
    ImageButton middle_right;
    ImageButton bottom_left;
    ImageButton bottom_middle;
    ImageButton bottom_right;

    EditText player_change;

    TicTacToeListener tic_tac_listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic__tac__toe);

        //Declare all the variables
        player1_turn = true;
        player2_turn = false;
        player1_win = false;
        player2_win = false;
        tie = false;

        top_left = (ImageButton) findViewById(R.id.top_left);
        top_middle = (ImageButton) findViewById(R.id.top_middle);
        top_right = (ImageButton) findViewById(R.id.top_right);
        middle_left = (ImageButton) findViewById(R.id.middle_left);
        middle = (ImageButton) findViewById(R.id.middle);
        middle_right = (ImageButton) findViewById(R.id.middle_right);
        bottom_left = (ImageButton) findViewById(R.id.bottom_left);
        bottom_middle = (ImageButton) findViewById(R.id.bottom_middle);
        bottom_right = (ImageButton) findViewById(R.id.bottom_right);

        tic_tac_listener = new TicTacToeListener(this);
        top_left.setOnClickListener(tic_tac_listener);
        top_middle.setOnClickListener(tic_tac_listener);
        top_right.setOnClickListener(tic_tac_listener);
        middle_left.setOnClickListener(tic_tac_listener);
        middle.setOnClickListener(tic_tac_listener);
        middle_right.setOnClickListener(tic_tac_listener);
        bottom_left.setOnClickListener(tic_tac_listener);
        bottom_middle.setOnClickListener(tic_tac_listener);
        bottom_right.setOnClickListener(tic_tac_listener);

        //play the game
        //playGame();

    }

    //Check if player 1 or player 2 have 3 in a row.
    public boolean check_three_in_row()
    {
        return false;
    }

}
