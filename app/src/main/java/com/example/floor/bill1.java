package com.example.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class bill1 extends AppCompatActivity {
    Button marble;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill1);
        t=findViewById(R.id.textView11);
        Intent inteNT=getIntent() ;
        String b=inteNT.getStringExtra("NUM");
        int bill=Integer.valueOf(b)*50;
        String B=String.valueOf(bill);
        t.setText(B);
        t.setTextSize(20);
        marble=findViewById(R.id.marble);
        marble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Imarble=getPackageManager().getLaunchIntentForPackage("com.example.navdrawer");
                startActivity(Imarble);
            }
        });
    }
}