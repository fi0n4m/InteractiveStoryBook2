package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page4 extends AppCompatActivity {

    TextView page4;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        page4 = findViewById(R.id.page4);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page4.setText(" Nang sumapit ang gabi kinuha ni "+ name + " ang lahat ng magagandang katangian ng mga gulay at kanyang isinuot.");
    }

    public void goToPage5(View view){
        Intent i = new Intent(this, Page5.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToPage3(View view){
        Intent i = new Intent(this, Page3.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}