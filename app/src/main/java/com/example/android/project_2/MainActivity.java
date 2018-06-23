package com.example.android.project_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int scoreOne = 0;
    int scoreTwo = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addTwoTeamOne(View v)
    {
        scoreOne += 2;
        displayForTeamOne(scoreOne);
    }

    public void addThreeTeamOne(View v)
    {
        scoreOne += 3;
        displayForTeamOne(scoreOne);
    }

    public void addOneTeamOne(View v)
    {
        scoreOne ++;
        displayForTeamOne(scoreOne);
    }

    public void addTwoTeamTwo(View v)
    {
        scoreTwo += 2;
        displayForTeamTwo(scoreTwo);
    }


    public void addThreeTeamTwo(View v)
    {
        scoreTwo += 3;
        displayForTeamTwo(scoreTwo);
    }

    public void addOneTeamTwo(View v)
    {
        scoreTwo ++;
        displayForTeamTwo(scoreTwo);
    }

    public void displayForTeamOne(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.score1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamTwo(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.score2);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v)
    {
        scoreOne = scoreTwo = 0;
        displayForTeamOne(scoreOne);
        displayForTeamTwo(scoreTwo);
    }
}
