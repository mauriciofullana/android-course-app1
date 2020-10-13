package com.example.testapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private Button btnPlus, btnMinus, btnEqual, btnClear, btnDivide, btnMultiply, btnSubtract;
    private TextView txtResult;

    Integer firstInput = 0, secondInput = 0;
    boolean isAdd, isSub, isMultiply, isDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);

        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivide = findViewById(R.id.btn_div);
        btnClear = findViewById(R.id.btn_clear);
        btnEqual = findViewById(R.id.btn_equal);

        txtResult = findViewById(R.id.txt_result);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResult.getText().toString().length() != 0) {
                    firstInput = Integer.valueOf(txtResult.getText().toString());
                    isAdd = true;
                    txtResult.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResult.getText().toString().length() != 0) {
                    firstInput = Integer.valueOf(txtResult.getText().toString());
                    isSub = true;
                    txtResult.setText(null);
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResult.getText().toString().length() != 0) {
                    firstInput = Integer.valueOf(txtResult.getText().toString());
                    isMultiply = true;
                    txtResult.setText(null);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResult.getText().toString().length() != 0) {
                    firstInput = Integer.valueOf(txtResult.getText().toString());
                    isDivision = true;
                    txtResult.setText(null);
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstInput = 0;
                secondInput = 0;
                txtResult.setText("");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isAdd || isSub || isMultiply || isDivision) {
                    secondInput = Integer.valueOf(txtResult.getText().toString());
                }

                if (isAdd) {
                    txtResult.setText(firstInput + secondInput +"");
                    isAdd = false;
                }

                if (isSub) {
                    txtResult.setText(firstInput - secondInput +"");
                    isSub = false;
                }

                if (isMultiply) {
                    txtResult.setText(firstInput * secondInput +"");
                    isMultiply = false;
                }

                if (isDivision) {
                    double resultValue = firstInput / secondInput;
                    txtResult.setText(String.format("%.2f", resultValue));
                    isDivision = false;
                }
            }
        });
    }

    public void numberOperation(View v) {
        Button button = (Button) v;
        txtResult.setText(txtResult.getText().toString() + button.getText().toString());
    }
}