package com.example.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;
    private String[] options = {
        "Introduction",
        "My Bio App - Relative Layout",
        "My Bio App - Lienear Layout",
        "Login Form - Constraint Layout",
        "Dice App",
        "Sms App",
        "Currency Converter",
        "Passing data between Activities/Screens",
        "Calculator - Linear Layout",
        "Calculator - Constraint Layout"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listView = findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                         intent = new Intent(ListViewActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(ListViewActivity.this, MyBioRelativeLayout.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(ListViewActivity.this, MyBioLinearLayout.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(ListViewActivity.this, LoginFormActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(ListViewActivity.this, DiceActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(ListViewActivity.this, SmsActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(ListViewActivity.this, CurrencyConverterActivity.class);
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(ListViewActivity.this, Activity_a.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(ListViewActivity.this, CalculatorActivity.class);
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(ListViewActivity.this, Calculator2.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
