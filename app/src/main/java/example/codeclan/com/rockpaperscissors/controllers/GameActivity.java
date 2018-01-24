package example.codeclan.com.rockpaperscissors.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import example.codeclan.com.rockpaperscissors.model.Move;
import example.codeclan.com.rockpaperscissors.model.RockPaperScissors;
import example.codeclan.com.rockpaperscissors.R;


public class GameActivity extends AppCompatActivity {

    ImageButton rock;
    ImageButton scissors;
    ImageButton paper;
    RockPaperScissors game;
    TextView result;
    TextView winCount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        game = new RockPaperScissors();
        rock = findViewById(R.id.rock);
        rock.setTag(Move.ROCK);
        scissors = findViewById(R.id.scissors);
        scissors.setTag(Move.SCISSORS);
        paper = findViewById(R.id.paper);
        paper.setTag(Move.PAPER);
        result = findViewById(R.id.handResult);
        winCount = findViewById(R.id.userWinCount);

    }


    public void onButtonClick(View button){
        Move userMove = (Move) button.getTag();

        String roundResult = game.playRound(userMove);

        result.setText(roundResult);
        winCount.setText(game.getWinCount());

    }

}
