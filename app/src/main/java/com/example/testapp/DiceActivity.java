package com.example.testapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {

    private ImageView ivPlaceHolder;
    private Button btnRollDice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        ivPlaceHolder = findViewById(R.id.iv_placeholder);
        btnRollDice = findViewById(R.id.btn_roll_dice);

        final Random random = new Random();

        btnRollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumber = random.nextInt(6) + 1;

                if(randomNumber == 1) {
                    ivPlaceHolder.setImageResource(R.drawable.one);
                } else if (randomNumber == 2) {
                    ivPlaceHolder.setImageResource(R.drawable.one);
                } else if (randomNumber == 3) {
                    ivPlaceHolder.setImageResource(R.drawable.three);
                } else if (randomNumber == 4) {
                    ivPlaceHolder.setImageResource(R.drawable.four);
                } else if (randomNumber == 5) {
                    ivPlaceHolder.setImageResource(R.drawable.five);
                } else {
                    ivPlaceHolder.setImageResource(R.drawable.six);
                }
            }
        });
    }
}
