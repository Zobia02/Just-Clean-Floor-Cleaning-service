package com.example.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bookfloor(View view) {
       Intent i=new Intent(this,floorcategory.class);
        startActivity(i);
    }

    public void flloor(View view) {
        Intent i =new Intent(this,floorcategory.class);
        startActivity(i);
    }
}