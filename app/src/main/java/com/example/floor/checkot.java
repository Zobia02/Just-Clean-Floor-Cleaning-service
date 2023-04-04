package com.example.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class checkot extends AppCompatActivity {
    Button wood;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkot);
        t=findViewById(R.id.textView11);
        Intent inteNT=getIntent() ;
        String b=inteNT.getStringExtra("NUM");
        int bill=Integer.valueOf(b)*45;
        String B=String.valueOf(bill);
        t.setText(B);
        t.setTextSize(20);
        wood=findViewById(R.id.wood);
        wood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Iwood=getPackageManager().getLaunchIntentForPackage("com.example.navdrawer");
                startActivity(Iwood);
            }
        });

    }
}