package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Search extends AppCompatActivity implements View.OnClickListener {

    TextView result;
    Button btnClickMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        result = (TextView)findViewById(R.id.firstName1);
        System.out.println("*******************************************" +result.toString());
        // create the get Intent object
        Intent intent = getIntent();

        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String str = intent.getStringExtra("firstName1");

        // display the string into textView
        result.setText(str);


        btnClickMe = (Button) findViewById(R.id.searchBtn);

        btnClickMe.setOnClickListener(Search.this);

    }

    public void onClick(View view) {

            startActivity(new Intent(Search.this, FoodTypeActivity.class));

    }
}
