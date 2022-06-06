package com.example.retrofitapiregistratsiya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity3 extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView=findViewById(R.id.textview2);
        imageView=findViewById(R.id.imageview2);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String rasm=intent.getStringExtra("rasm");
        String description=intent.getStringExtra("description");
        Double price=intent.getDoubleExtra("price",0);

        Glide.with(MainActivity3.this).load(rasm).into(imageView);
        textView.setText(name+"\n"+description+"\n Narxi: "+price);
    }
}