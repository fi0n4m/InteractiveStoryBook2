package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page5 extends AppCompatActivity {

    TextView page5;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        page5 = findViewById(R.id.page5);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page5.setText(" Tuwang-tuwa si " + name + " nang biglang maging sentro siya ng atensyon sa gulayang dating hindi pinapansin. Ngunit, nagkaruon ng pagtitipon ang ibang gulay, at nagkasundo na subaybayan ang mga may kakaibang ganda. Sa sobrang gulat ng ibang gulay, nakita nila si " + name + " na isa-isa'y naglalantad ng kanyang mga katangian." );
    }

    public void goToPage6(View view){
        Intent i = new Intent(this, Page6.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToPage4(View view){
        Intent i = new Intent(this, Page4.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}