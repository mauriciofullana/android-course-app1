package com.example.testapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CurrencyConverterActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnConvert;
    private EditText edtDollar;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        btnConvert = findViewById(R.id.btn_convert);
        edtDollar = findViewById(R.id.edt_dollar);
        txtResult = findViewById(R.id.txt_result);

        btnConvert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (edtDollar.getText().toString().length() > 0) {
            double dollar = Double.parseDouble(edtDollar.getText().toString());
            double convertedPound = dollar * 0.77;
            txtResult.setText(convertedPound+"");
        } else {
            Toast.makeText(this, "Enter value!", Toast.LENGTH_SHORT).show();
        }

    }
}
