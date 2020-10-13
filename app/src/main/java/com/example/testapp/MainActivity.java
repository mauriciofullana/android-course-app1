package com.example.testapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtCounter;
    private Button btnPlus, btnMinus, btnReset, btnHideShow;
    private ImageView imgMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCounter = findViewById(R.id.txt_counter);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnReset = findViewById(R.id.btn_reset);
        imgMain = findViewById(R.id.img_main);
        btnHideShow = findViewById(R.id.btn_hide_show);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnReset.setOnClickListener(this);

        btnHideShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgMain.getVisibility()==View.VISIBLE) {
                    imgMain.setVisibility(View.INVISIBLE);
                } else {
                    imgMain.setVisibility(View.VISIBLE);
                }
            }
        });

        /*btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int counter = Integer.parseInt(txtCounter.getText().toString());
                counter++;
                txtCounter.setText(counter+"");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int counter = Integer.parseInt(txtCounter.getText().toString());
                if(counter != 0) {
                    counter--;
                }
                txtCounter.setText(counter+"");
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCounter.setText("0");
            }
        });*/
    }

    /*public void plusFunction(View view) {
        int counter = Integer.parseInt(txtCounter.getText().toString());
        counter++;
        txtCounter.setText(counter+"");
    }

    public void minusFunction(View view) {
        int counter = Integer.parseInt(txtCounter.getText().toString());
        if(counter != 0) {
            counter--;
        }
        txtCounter.setText(counter+"");
    }

    public void resetFunction(View view) {
        txtCounter.setText("0");
    }*/

    /*public void operation(View view) {
        int viewId = view.getId();
        int counter = 0;

        switch (viewId) {
            case R.id.btn_plus:
                counter = Integer.parseInt(txtCounter.getText().toString());
                counter++;
                txtCounter.setText(counter+"");
                break;
            case R.id.btn_minus:
                counter = Integer.parseInt(txtCounter.getText().toString());
                if(counter != 0) {
                    counter--;
                }
                txtCounter.setText(counter+"");
                break;
            case R.id.btn_reset:
                txtCounter.setText("0");
                break;
        }
    }*/

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        int counter = 0;

        switch (viewId) {
            case R.id.btn_plus:
                counter = Integer.parseInt(txtCounter.getText().toString());
                counter++;
                txtCounter.setText(counter+"");
                break;
            case R.id.btn_minus:
                counter = Integer.parseInt(txtCounter.getText().toString());
                if(counter != 0) {
                    counter--;
                }
                txtCounter.setText(counter+"");
                break;
            case R.id.btn_reset:
                txtCounter.setText("0");
                break;
        }
    }
}
