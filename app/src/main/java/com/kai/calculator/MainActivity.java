package com.kai.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Confirm(View view){
        EditText et = findViewById(R.id.editTextTextPersonName);
        Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
        intent.putExtra("name", et.getText().toString());
        startActivity(intent);
    }

    public void Rest(View view){
        EditText et = findViewById(R.id.editTextTextPersonName);
        et.setText("");
    }
}