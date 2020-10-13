package com.example.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        String name =  getIntent().getStringExtra("name");
        int age =  getIntent().getIntExtra("age", 0);
        String message = getIntent().getStringExtra("message");

        TextView txtB = findViewById(R.id.txt_activity_b);
        txtB.setText("Name: " + name + "\nAge: " + age + "\nMessage: " + message);

        Button btnB = findViewById(R.id.btn_b);
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_b.this, ListViewActivity.class));
            }
        });
    }
}