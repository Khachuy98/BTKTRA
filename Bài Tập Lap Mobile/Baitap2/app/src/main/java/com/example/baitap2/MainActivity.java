package com.example.baitap2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnchangeimg;
    ImageView imgview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnchangeimg = (Button) findViewById(R.id.btnchangeImg);
        imgview = (ImageView) findViewById(R.id.imgView);

        imgview.setBackgroundResource(R.mipmap.aa);
        btnchangeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgview.setBackgroundResource(R.mipmap.bia);
            }
        });
    }
}
