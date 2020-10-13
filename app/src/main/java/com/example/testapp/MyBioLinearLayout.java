package com.example.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MyBioLinearLayout extends AppCompatActivity {

    private EditText edtName, edtPhone, edtEmail, edtAddress;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_bio_linear_layout);

        edtName = findViewById(R.id.edt_name);
        edtPhone = findViewById(R.id.edt_phone);
        edtEmail = findViewById(R.id.edt_email);
        edtAddress = findViewById(R.id.edt_address);
        btnSend = findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyBioLinearLayout.this, ProfileActivity.class);
                intent.putExtra("name", edtName.getText().toString());
                intent.putExtra("phone", edtPhone.getText().toString());
                intent.putExtra("email", edtEmail.getText().toString());
                intent.putExtra("address", edtAddress.getText().toString());

                startActivity(intent);
            }
        });
    }
}
