package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreForTeamA(int scoreA) {
        TextView scoreATextView = (TextView) findViewById(R.id.score_a_text_view);
        scoreATextView.setText(String.valueOf(scoreA));
    }

    public void displayScoreForTeamB(int scoreB) {
        TextView scoreBTextView = (TextView) findViewById(R.id.score_b_text_view);
        scoreBTextView.setText(String.valueOf(scoreB));
    }

    public void addThreePointsForTeamA(View view) {
        scoreA += 3;
        displayScoreForTeamA(scoreA);
    }

    public void addThreePointsForTeamB(View view) {
        scoreB += 3;
        displayScoreForTeamB(scoreB);
    }

    public void addTwoPointsForTeamA(View view) {
        scoreA += 2;
        displayScoreForTeamA(scoreA);
    }

    public void addTwoPointsForTeamB(View view) {
        scoreB += 2;
        displayScoreForTeamB(scoreB);
    }

    public void addOnePointsForTeamA(View view) {
        scoreA += 1;
        displayScoreForTeamA(scoreA);
    }

    public void addOnePointsForTeamB(View view) {
        scoreB += 1;
        displayScoreForTeamB(scoreB);
    }

    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        displayScoreForTeamA(scoreA);
        displayScoreForTeamB(scoreB);
    }
}