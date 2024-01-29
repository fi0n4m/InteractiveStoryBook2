package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {

    TextView page2;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        page2 = findViewById(R.id.page2);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page2.setText(" Subalit may isang gulay na umusbong na kakaiba ang anyo, siya si "+ name + " na may maputlang maputlang kulay, at ang kanyang lasang taglay ay di maipaliwanag. ");
    }

    public void goToPage3(View view){
        Intent i = new Intent(this, Page3.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToPage1(View view){
        Intent i = new Intent(this, Page1.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}