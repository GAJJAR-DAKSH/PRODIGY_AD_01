package com.example.prodigy_ad_01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button add, sub, mul, div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);

        result = findViewById(R.id.result);

        add.setOnClickListener(v -> {
            double a = Double.parseDouble(num1.getText().toString());
            double b = Double.parseDouble(num2.getText().toString());
            result.setText("Result: " + (a + b));
        });

        sub.setOnClickListener(v -> {
            double a = Double.parseDouble(num1.getText().toString());
            double b = Double.parseDouble(num2.getText().toString());
            result.setText("Result: " + (a - b));
        });

        mul.setOnClickListener(v -> {
            double a = Double.parseDouble(num1.getText().toString());
            double b = Double.parseDouble(num2.getText().toString());
            result.setText("Result: " + (a * b));
        });

        div.setOnClickListener(v -> {
            double a = Double.parseDouble(num1.getText().toString());
            double b = Double.parseDouble(num2.getText().toString());

            if (b != 0)
                result.setText("Result: " + (a / b));
            else
                result.setText("Cannot divide by zero");
        });
    }
}
