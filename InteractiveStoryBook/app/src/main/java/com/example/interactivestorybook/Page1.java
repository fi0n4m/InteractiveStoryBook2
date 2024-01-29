package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page1 extends AppCompatActivity {

    TextView page1;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        page1 = findViewById(R.id.page1);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page1.setText(name + " loved looking at the stars. He wanted to jump up and touch them.");
    }

    public void goToPage2(View view){
        Intent i = new Intent(this, Page2.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToMainActivity(View v){
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}