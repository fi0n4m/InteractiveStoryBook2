package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page7 extends AppCompatActivity {
    TextView page7;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);

        page7 = findViewById(R.id.page7);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page7.setText(name + " was disappointed. He looked down. His heart skipped a beat in fear.");
    }

    public void goToPage8(View view){
        Intent i = new Intent(this, Page8.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToPage6(View view){
        Intent i = new Intent(this, Page6.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}