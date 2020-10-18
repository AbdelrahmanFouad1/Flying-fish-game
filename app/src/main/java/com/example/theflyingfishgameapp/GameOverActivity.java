package com.example.theflyingfishgameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    private Button gameOver;
    private TextView displayScore;
    private String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_came_over);

        score = getIntent().getExtras().get("score").toString();

        gameOver = findViewById(R.id.playAgain_btn_GameOver);
        displayScore = findViewById(R.id.displayScore_tv_gameOver);

        gameOver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(GameOverActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

        displayScore.setText("Score = "+ score);
    }
}
