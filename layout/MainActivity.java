package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button upbutton, downbutton;
    ImageView imageview1, imageview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview1 = findViewById(R.id.imageView);
        imageview2 = findViewById(R.id.imageView2);

        upbutton = findViewById(R.id.button01);

        upbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveUPImage();
            }
        });

        downbutton = findViewById((R.id.button02));
        downbutton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveDownImage();
            }
        }));
    }

    public void moveUPImage(){
        imageview1.setImageResource(R.drawable.star);
        imageview2.setImageResource(0);
    }
    public void moveDownImage(){
        imageview2.setImageResource(R.drawable.star);
        imageview1.setImageResource(0);
    }
}
