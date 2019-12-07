package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FoodTypeActivity extends AppCompatActivity  implements View.OnClickListener {
    Button btnAmerican, btnItalian,btnIndian,btnChinese,btnMexican;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_type);

        btnAmerican = (Button) findViewById(R.id.american);
        btnAmerican.setOnClickListener(FoodTypeActivity.this);

        btnItalian = (Button) findViewById(R.id.italian);
        btnItalian.setOnClickListener(FoodTypeActivity.this);

        btnIndian = (Button) findViewById(R.id.indian);
        btnIndian.setOnClickListener(FoodTypeActivity.this);

        btnChinese = (Button) findViewById(R.id.chinese);
        btnChinese.setOnClickListener(FoodTypeActivity.this);

        btnMexican = (Button) findViewById(R.id.mexican);
        btnMexican.setOnClickListener(FoodTypeActivity.this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.american) {
        startActivity(new Intent(FoodTypeActivity.this, AmericanRestActivity.class));
        } else if (view.getId() == R.id.italian) {
            startActivity(new Intent(FoodTypeActivity.this, ItalianRestActivity.class));
        }else if (view.getId() == R.id.indian) {
            startActivity(new Intent(FoodTypeActivity.this, IndianRestActivity.class));
        }else if (view.getId() == R.id.chinese) {
            startActivity(new Intent(FoodTypeActivity.this, ChineseRestActivity.class));
        }else if (view.getId() == R.id.mexican) {
            startActivity(new Intent(FoodTypeActivity.this, MexicanRestActivity.class));
        }
    }
}
