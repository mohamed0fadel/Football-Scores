package com.example.android.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsA = 0, shotsA = 0, freeA = 0, cornerA = 0, tacklesA = 0, savsA = 0,
            goalsB = 0, shotsB = 0, freeB = 0, cornerB = 0, tacklesB = 0, savsB = 0;

    TextView txtTeamAGoals, txtTeamAShots, txtTeamAFree, txtTeamACorner, txtTeamATackles, txtTeamASaves,
                 txtTeamBGoals, txtTeamBShots, txtTeamBFree, txtTeamBCorner, txtTeamBTackles, txtTeamBSaves;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTeamAGoals = (TextView)findViewById(R.id.txt_teamAGoals);
        txtTeamAShots = (TextView)findViewById(R.id.txt_teamAShots);
        txtTeamAFree = (TextView)findViewById(R.id.txt_teamAFree);
        txtTeamACorner = (TextView)findViewById(R.id.txt_teamACorner);
        txtTeamATackles = (TextView)findViewById(R.id.txt_teamATackles);
        txtTeamASaves = (TextView)findViewById(R.id.txt_teamASaves);

        txtTeamBGoals = (TextView)findViewById(R.id.txt_teamBGoals);
        txtTeamBShots = (TextView)findViewById(R.id.txt_teamBShots);
        txtTeamBFree = (TextView)findViewById(R.id.txt_teamBFree);
        txtTeamBCorner = (TextView)findViewById(R.id.txt_teamBCorner);
        txtTeamBTackles = (TextView)findViewById(R.id.txt_teamBTackles);
        txtTeamBSaves = (TextView)findViewById(R.id.txt_teamBSaves);
    }

    public void addGoalForA(View view) {
        txtTeamAGoals.setText(String.valueOf(++goalsA));
    }

    public void addGoalForB(View view) {
        txtTeamBGoals.setText(String.valueOf(++goalsB));
    }


    public void addShotForA(View view) {
        txtTeamAShots.setText(String.valueOf(++shotsA));
    }


    public void addShotForB(View view) {
        txtTeamBShots.setText(String.valueOf(++shotsB));
    }

    public void addFreeForA(View view) {
        txtTeamAFree.setText(String.valueOf(++freeA));
    }

    public void addFreeForB(View view) {
        txtTeamBFree.setText(String.valueOf(++freeB));
    }

    public void addCornerForA(View view) {
        txtTeamACorner.setText(String.valueOf(++cornerA));
    }

    public void addCornerForB(View view) {
        txtTeamBCorner.setText(String.valueOf(++cornerB));
    }

    public void addTackleForA(View view) {
        txtTeamATackles.setText(String.valueOf(++tacklesA));
    }

    public void addTackleForB(View view) {
        txtTeamBTackles.setText(String.valueOf(++tacklesB));
    }


    public void addSavesForA(View view) {
        txtTeamASaves.setText(String.valueOf(++savsA));
    }

    public void addSavesForB(View view) {
        txtTeamBSaves.setText(String.valueOf(++savsB));
    }


    public void resetGame(View view) {
        goalsA = 0;
        shotsA = 0;
        freeA = 0;
        cornerA = 0;
        tacklesA = 0;
        savsA = 0;
        goalsB = 0;
        shotsB = 0;
        freeB = 0;
        cornerB = 0;
        tacklesB = 0;
        savsB = 0;

        txtTeamAGoals.setText(String.valueOf(goalsA));
        txtTeamBGoals.setText(String.valueOf(goalsB));
        txtTeamAShots.setText(String.valueOf(shotsA));
        txtTeamBShots.setText(String.valueOf(shotsB));
        txtTeamAFree.setText(String.valueOf(freeA));
        txtTeamBFree.setText(String.valueOf(freeB));
        txtTeamACorner.setText(String.valueOf(cornerA));
        txtTeamBCorner.setText(String.valueOf(cornerB));
        txtTeamATackles.setText(String.valueOf(tacklesA));
        txtTeamBTackles.setText(String.valueOf(tacklesB));
        txtTeamASaves.setText(String.valueOf(savsA));
        txtTeamBSaves.setText(String.valueOf(savsB));
    }
}
