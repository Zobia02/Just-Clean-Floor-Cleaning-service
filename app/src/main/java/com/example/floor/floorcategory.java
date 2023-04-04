package com.example.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class floorcategory extends AppCompatActivity {
    int marble=50;
    int wood =45;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floorcategory);
    }



    public void woodfloorbill(View view) {
        Intent i =new Intent(this,deliveryform.class);
        i.putExtra("Wood",wood);
        startActivity(i);

    }

    public void marblefloorbill(View view) {
        Intent i =new Intent(this,deliveryform1.class);

        i.putExtra("Marble",marble);
       startActivity(i);
    }
}