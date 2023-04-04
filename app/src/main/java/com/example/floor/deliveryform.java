package com.example.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class deliveryform extends AppCompatActivity {
    EditText et,a,c,n;
    String number,adress,contact,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliveryform);
        et=findViewById(R.id.editTextTextPersonName);
        a=findViewById(R.id.editTextTextPersonName2);
        c=findViewById(R.id.editTextTextPersonName3);
      n=findViewById(R.id.editTextTextPersonName5);

    }

    public void checkout(View view) {

        number=et.getEditableText().toString();

        adress=a.getEditableText().toString();
        contact=c.getEditableText().toString();
        name=n.getEditableText().toString();
        if(adress.isEmpty()){
            a.setError("please enter the address!!!");
            a.requestFocus();
            return;

        }
        if(name.isEmpty()){
            n.setError("please enter the name!!!");
            n.requestFocus();
            return;

        }
        if(contact.isEmpty()){
            c.setError("please enter the contact!!!");
            c.requestFocus();
            return;

        }
        if(number.isEmpty()){
            et.setError("please enter the area!!!");
            et.requestFocus();
            return;

        }
        Intent c=new Intent(this,bill1.class);

        Intent inte=new Intent(this,bill1.class);
        inte.putExtra("NUM",number);
        startActivity(inte);



    }
}