package com.example.doitmission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.inputmessage);
    }

    public void onclickedButton01(View view) {
        String data = input.getText().toString().trim();
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
    }

    public void onclickedButton02(View view) {

    }
}
