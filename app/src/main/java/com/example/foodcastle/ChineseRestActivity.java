package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChineseRestActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2,btn3,btn4;
    TextView restName;
    String restuName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_rest);

        btn1 =   findViewById(R.id.pfchang);
        btn1.setOnClickListener(ChineseRestActivity.this);

        btn2 =   findViewById(R.id.pandaex);
        btn2.setOnClickListener(ChineseRestActivity.this);

        btn3 =   findViewById(R.id.dragon);
        btn3.setOnClickListener(ChineseRestActivity.this);

        btn4 =   findViewById(R.id.shangai);
        btn4.setOnClickListener(ChineseRestActivity.this);



    }

    public void onClick(View view) {
        SharedPreferences mPref= this.getSharedPreferences("session", MODE_PRIVATE);
        if (view.getId() == R.id.pfchang) {

            restuName = "P F Chang";

            mPref.edit().putString("session_id", restuName).apply();


            startActivity(new Intent(ChineseRestActivity.this, AmericanMenuActivity.class));
        } else if (view.getId() == R.id.pandaex) {
            restuName = "Panda Express";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(ChineseRestActivity.this, AmericanMenuActivity.class));
        }else if (view.getId() == R.id.dragon) {
            restuName = "Dragon Palace";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(ChineseRestActivity.this, AmericanMenuActivity.class));
        }else if (view.getId() == R.id.shangai) {
            restuName = "Ala Shangai";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(ChineseRestActivity.this, AmericanMenuActivity.class));
        }
    }


    }


