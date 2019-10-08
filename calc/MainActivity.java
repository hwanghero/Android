package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button minus;
    TextView textview;
    String num1, num2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("미니 계산기");

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        minus = findViewById(R.id.buttonMinus);
        textview = findViewById(R.id.textview);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textview.setText("결과: "+result);
            }
        });
    }

    public void onPlus(View view) {
        num1 = edit1.getText().toString();
        num2 = edit2.getText().toString();
        result = Integer.parseInt(num1) + Integer.parseInt(num2);
        textview.setText("결과: "+result);
    }

    public void onDivision(View view) {
        num1 = edit1.getText().toString();
        num2 = edit2.getText().toString();
        result = Integer.parseInt(num1) * Integer.parseInt(num2);
        textview.setText("결과: "+result);
    }

    public void onMutiply(View view) {
        num1 = edit1.getText().toString();
        num2 = edit2.getText().toString();
        result = Integer.parseInt(num1) / Integer.parseInt(num2);
        textview.setText("결과: "+result);
    }
}
