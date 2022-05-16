package com.kai.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        TextView tv = findViewById(R.id.textView);
        tv.setText(name);
    }

    public void Rest(View view){
        et1 = findViewById(R.id.editTextNumberDecimal);
        et2 = findViewById(R.id.editTextNumberDecimal2);
        et3 = findViewById(R.id.editTextNumberDecimal3);

        et1.setText("");
        et2.setText("");
        et3.setText("");
    }

    public void Add(View view){

        et1 = findViewById(R.id.editTextNumberDecimal);
        et2 = findViewById(R.id.editTextNumberDecimal2);
        et3 = findViewById(R.id.editTextNumberDecimal3);

        float n1 = Float.valueOf(et1.getText().toString());
        float n2 = Float.valueOf(et2.getText().toString());

        float result = n1 + n2;

        et3.setText(result+"");
    }
    public void Subtract(View view){

        et1 = findViewById(R.id.editTextNumberDecimal);
        et2 = findViewById(R.id.editTextNumberDecimal2);
        et3 = findViewById(R.id.editTextNumberDecimal3);

        float n1 = Float.valueOf(et1.getText().toString());
        float n2 = Float.valueOf(et2.getText().toString());

        float result = n1 - n2;

        et3.setText(result+"");
    }

    public void Multiply(View view){

        et1 = findViewById(R.id.editTextNumberDecimal);
        et2 = findViewById(R.id.editTextNumberDecimal2);
        et3 = findViewById(R.id.editTextNumberDecimal3);

        float n1 = Float.valueOf(et1.getText().toString());
        float n2 = Float.valueOf(et2.getText().toString());

        float result = n1 * n2;

        et3.setText(result+"");
    }

    public void Divide(View view){

        et1 = findViewById(R.id.editTextNumberDecimal);
        et2 = findViewById(R.id.editTextNumberDecimal2);
        et3 = findViewById(R.id.editTextNumberDecimal3);

        float n1 = Float.valueOf(et1.getText().toString());
        float n2 = Float.valueOf(et2.getText().toString());

        float result =  n1 / n2;

        et3.setText(result+"");
    }

    public void Factorial(View view){

        et1 = findViewById(R.id.editTextNumberDecimal);
        et2 = findViewById(R.id.editTextNumberDecimal2);
        et3 = findViewById(R.id.editTextNumberDecimal3);

        long n1 = Long.parseLong(et1.getText().toString());
        et2.setText("Blank Column");

        if(n1 <= 1){
            et3.setText("1");
        }else{
            long a = 1;
            for(long i = 1; i <= n1; i++){
                a *= i;
            }
            et3.setText( a +"");
        }
    }
}