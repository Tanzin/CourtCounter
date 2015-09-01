package com.keepsearching.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView score_view_team_A;// = (TextView) findViewById(R.id.scoreTeamA);
    TextView score_view_team_B;// = (TextView) findViewById(R.id.scoreTeamB);
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score_view_team_A = (TextView) findViewById(R.id.scoreTeamA);
        score_view_team_B = (TextView) findViewById(R.id.scoreTeamB);
    }
/*Adding scores for team A*/
    public void addThreeForTeamA(View v) {
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View v) {
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }
    /*Displaying the score of team A*/
    public void displayScoreTeamA(int score) {

        score_view_team_A.setText(String.valueOf(score));
    }


    /*Adding scores for team B*/
    public void addThreeForTeamB(View v) {
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View v) {
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);
    }
    /*Displaying the score of team B*/
    public void displayScoreTeamB(int score) {
        score_view_team_B.setText(String.valueOf(score));
    }

    /* Reseting the score to 0-0 for a new start*/

    public void resetScore(View v)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }

    /*showing the result when end game button pressed */
    public void endGame(View v)
    {
        if(scoreTeamA > scoreTeamB) {
            score_view_team_A.setText("won !");
            score_view_team_B.setText("loose");
        }
        else if(scoreTeamB > scoreTeamA){
            score_view_team_B.setText("won !");
            score_view_team_A.setText("loose");
        }
        else{
            score_view_team_B.setText("Draw");
            score_view_team_A.setText("Draw");
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
