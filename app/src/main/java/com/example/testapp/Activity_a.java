package com.example.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button btnA = findViewById(R.id.btn_a);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_a.this, Activity_b.class);
                intent.putExtra("name", "Mauricio Fullana");
                intent.putExtra("age", 31);
                intent.putExtra("message", "Test message");
                startActivity(intent);
            }
        });
    }
}