package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText home;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = findViewById(R.id.home);
    }

    public void goToPage1(View view) {
        name = home.getText().toString();
        Toast.makeText(this, "Hello, " + name + "!", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, Page1.class);
        i.putExtra("name", name);
        startActivity(i);

    }
}