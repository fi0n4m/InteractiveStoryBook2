package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page8 extends AppCompatActivity {

    TextView page8;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);

        page8 = findViewById(R.id.page8);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page8.setText("Laking tuwa ni " + name + "dahil inisip niya na iyon lamang pala ang kabayaran sa ginawa niyang kasalanan. Ngunit makalipas ang ilang sandali ay nag iba ang kanyang anyo. Ang balat niya ay kumulubot dahil ang kinis at gaspang na taglay ni upo at kamatis ay nag-away sa loob ng kanyang katawan maging ang mga ibat-ibang lasa ng gulay ay naghatid ng di magandang panlasa sa kanya at pait ang idinulot nito." );
    }

    public void goToPage9(View view){
        Intent i = new Intent(this, Page9.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToPage7(View view){
        Intent i = new Intent(this, Page7.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}