package com.example.android.tennisplayercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when player 1 score Fifteen points .
     */
    public void fifteenA(View view) {

        scoreTeamA = scoreTeamA + 15;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when player 1 score Ten points .
     */
    public void tenA(View view) {

        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);

    }

    /**
     * This method is called when player 1 score one points ..
     */
    public void oneA(View view) {

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void playerA(View v) {
        displayForTeamA(scoreTeamA=0);
        displayForTeamB(scoreTeamB=0);
    }

    /**
     * This method is called when team B score three points.
     */
    public void fifteenB(View view) {

        scoreTeamB = scoreTeamB + 15;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method is called when team B score two points.
     */
    public void tenB(View view) {

        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when team B score one point.
     */
    public void oneB(View view) {

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetB(View v) {
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }
}