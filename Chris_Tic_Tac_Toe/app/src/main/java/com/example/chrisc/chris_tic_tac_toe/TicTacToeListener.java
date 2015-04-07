package com.example.chrisc.chris_tic_tac_toe;


import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class TicTacToeListener implements OnClickListener {

    Tic_Tac_Toe tic_tac_activity;

    public TicTacToeListener (Context activity)
    {
        this.tic_tac_activity = (Tic_Tac_Toe) activity;
    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.top_left:
                if (tic_tac_activity.player1_turn && (tic_tac_activity.tic_tac_toe[0][0] != 2))
                {
                    tic_tac_activity.top_left.setImageResource(R.drawable.player1);
                    tic_tac_activity.tic_tac_toe[0][0] = 1;
                    tic_tac_activity.player1_win = tic_tac_activity.check_three_in_row();
                }
                else if(tic_tac_activity.player2_turn && (tic_tac_activity.tic_tac_toe[0][0]!= 1))
                {
                    tic_tac_activity.top_left.setImageResource(R.drawable.player2);
                    tic_tac_activity.tic_tac_toe[0][0] = 2;
                    tic_tac_activity.player2_win = tic_tac_activity.check_three_in_row();
                }
                break;
            case R.id.top_middle:
                if (tic_tac_activity.player1_turn && (tic_tac_activity.tic_tac_toe[0][1] != 2))
                {
                    tic_tac_activity.top_middle.setImageResource(R.drawable.player1);
                    tic_tac_activity.tic_tac_toe[0][1] = 1;
                    tic_tac_activity.player1_win = tic_tac_activity.check_three_in_row();
                }
                else if(tic_tac_activity.player2_turn && (tic_tac_activity.tic_tac_toe[0][1]!= 1))
                {
                    tic_tac_activity.top_middle.setImageResource(R.drawable.player2);
                    tic_tac_activity.tic_tac_toe[0][1] = 2;
                    tic_tac_activity.player2_win = tic_tac_activity.check_three_in_row();
                }
                break;
            case R.id.top_right:
                if (tic_tac_activity.player1_turn && (tic_tac_activity.tic_tac_toe[0][2] != 2))
                {
                    tic_tac_activity.top_right.setImageResource(R.drawable.player1);
                    tic_tac_activity.tic_tac_toe[0][2] = 1;
                    tic_tac_activity.player1_win = tic_tac_activity.check_three_in_row();
                }
                else if(tic_tac_activity.player2_turn && (tic_tac_activity.tic_tac_toe[0][2]!= 1))
                {
                    tic_tac_activity.top_right.setImageResource(R.drawable.player2);
                    tic_tac_activity.tic_tac_toe[0][2] = 2;
                    tic_tac_activity.player2_win = tic_tac_activity.check_three_in_row();
                }
                break;
            case R.id.middle_left:
                if (tic_tac_activity.player1_turn && (tic_tac_activity.tic_tac_toe[1][0] != 2))
                {
                    tic_tac_activity.middle_left.setImageResource(R.drawable.player1);
                    tic_tac_activity.tic_tac_toe[1][0] = 1;
                    tic_tac_activity.player1_win = tic_tac_activity.check_three_in_row();
                }
                else if(tic_tac_activity.player2_turn && (tic_tac_activity.tic_tac_toe[1][0]!= 1))
                {
                    tic_tac_activity.middle_left.setImageResource(R.drawable.player2);
                    tic_tac_activity.tic_tac_toe[1][0] = 2;
                    tic_tac_activity.player2_win = tic_tac_activity.check_three_in_row();
                }
                break;
            case R.id.middle:
                if (tic_tac_activity.player1_turn && (tic_tac_activity.tic_tac_toe[1][1] != 2))
                {
                    tic_tac_activity.middle.setImageResource(R.drawable.player1);
                    tic_tac_activity.tic_tac_toe[1][1] = 1;
                    tic_tac_activity.player1_win = tic_tac_activity.check_three_in_row();
                }
                else if(tic_tac_activity.player2_turn && (tic_tac_activity.tic_tac_toe[1][1]!= 1))
                {
                    tic_tac_activity.middle.setImageResource(R.drawable.player2);
                    tic_tac_activity.tic_tac_toe[1][1] = 2;
                    tic_tac_activity.player2_win = tic_tac_activity.check_three_in_row();
                }
                break;
            case R.id.middle_right:
                if (tic_tac_activity.player1_turn && (tic_tac_activity.tic_tac_toe[1][2] != 2))
                {
                    tic_tac_activity.middle_right.setImageResource(R.drawable.player1);
                    tic_tac_activity.tic_tac_toe[1][2] = 1;
                    tic_tac_activity.player1_win = tic_tac_activity.check_three_in_row();
                }
                else if(tic_tac_activity.player2_turn && (tic_tac_activity.tic_tac_toe[1][2]!= 1))
                {
                    tic_tac_activity.middle_right.setImageResource(R.drawable.player2);
                    tic_tac_activity.tic_tac_toe[1][2] = 2;
                    tic_tac_activity.player2_win = tic_tac_activity.check_three_in_row();
                }
                break;
            case R.id.bottom_left:
                if (tic_tac_activity.player1_turn && (tic_tac_activity.tic_tac_toe[2][0] != 2))
                {
                    tic_tac_activity.bottom_left.setImageResource(R.drawable.player1);
                    tic_tac_activity.tic_tac_toe[2][0] = 1;
                    tic_tac_activity.player1_win = tic_tac_activity.check_three_in_row();
                }
                else if(tic_tac_activity.player2_turn && (tic_tac_activity.tic_tac_toe[2][0]!= 1))
                {
                    tic_tac_activity.bottom_left.setImageResource(R.drawable.player2);
                    tic_tac_activity.tic_tac_toe[2][0] = 2;
                    tic_tac_activity.player2_win = tic_tac_activity.check_three_in_row();
                }
                break;
            case R.id.bottom_middle:
                if (tic_tac_activity.player1_turn && (tic_tac_activity.tic_tac_toe[2][1] != 2))
                {
                    tic_tac_activity.bottom_middle.setImageResource(R.drawable.player1);
                    tic_tac_activity.tic_tac_toe[2][1] = 1;
                    tic_tac_activity.player1_win = tic_tac_activity.check_three_in_row();
                }
                else if(tic_tac_activity.player2_turn && (tic_tac_activity.tic_tac_toe[2][1]!= 1))
                {
                    tic_tac_activity.bottom_middle.setImageResource(R.drawable.player2);
                    tic_tac_activity.tic_tac_toe[2][1] = 2;
                    tic_tac_activity.player2_win = tic_tac_activity.check_three_in_row();
                }
                break;
            case R.id.bottom_right:
                if (tic_tac_activity.player1_turn && (tic_tac_activity.tic_tac_toe[2][2] != 2))
                {
                    tic_tac_activity.bottom_right.setImageResource(R.drawable.player1);
                    tic_tac_activity.tic_tac_toe[2][2] = 1;
                    tic_tac_activity.player1_win = tic_tac_activity.check_three_in_row();
                }
                else if(tic_tac_activity.player2_turn && (tic_tac_activity.tic_tac_toe[2][2]!= 1))
                {
                    tic_tac_activity.bottom_right.setImageResource(R.drawable.player2);
                    tic_tac_activity.tic_tac_toe[2][2] = 2;
                    tic_tac_activity.player2_win = tic_tac_activity.check_three_in_row();
                }
                break;

            default:
                break;
        }

        if(tic_tac_activity.player1_turn)
        {
            tic_tac_activity.player1_turn = false;
            tic_tac_activity.player2_turn = true;
        }
        else if(tic_tac_activity.player2_turn)
        {
            tic_tac_activity.player2_turn = false;
            tic_tac_activity.player1_turn = true;
        }
    }

}
