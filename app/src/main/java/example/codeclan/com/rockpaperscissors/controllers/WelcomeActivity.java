package example.codeclan.com.rockpaperscissors.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import example.codeclan.com.rockpaperscissors.R;

public class WelcomeActivity extends AppCompatActivity {

    Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        play = findViewById(R.id.playBtn);
    }

    public void onPlayButtonClick(View view) {
        Intent beginGame = new Intent(this, GameActivity.class);
        startActivity(beginGame);

    }
}
