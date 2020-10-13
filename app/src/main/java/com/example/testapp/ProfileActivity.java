package com.example.testapp;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private EditText edtName, edtPhone, edtEmail, edtAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        edtName = findViewById(R.id.edt_name);
        edtPhone = findViewById(R.id.edt_phone);
        edtEmail = findViewById(R.id.edt_email);
        edtAddress = findViewById(R.id.edt_address);

        String name = getIntent().getStringExtra("name");
        String phone = getIntent().getStringExtra("phone");
        String email = getIntent().getStringExtra("email");
        String address = getIntent().getStringExtra("address");

        edtName.setText(name);
        edtPhone.setText(phone);
        edtEmail.setText(email);
        edtAddress.setText(address);
    }
}