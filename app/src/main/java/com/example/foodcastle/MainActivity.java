package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Declaration Button
    Button btnClickMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClickMe = (Button) findViewById(R.id.login);

        btnClickMe.setOnClickListener(MainActivity.this);
    }

    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
        //Your Logic
    }
}
