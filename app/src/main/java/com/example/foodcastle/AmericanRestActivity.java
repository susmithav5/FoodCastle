package com.example.foodcastle;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AmericanRestActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2,btn3,btn4,btn5;

    String restuName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.american_rest);

        btn1 =   findViewById(R.id.mcdonald);
        btn1.setOnClickListener(AmericanRestActivity.this);

        btn2 =   findViewById(R.id.bking);
        btn2.setOnClickListener(AmericanRestActivity.this);

        btn3 =   findViewById(R.id.wendy);
        btn3.setOnClickListener(AmericanRestActivity.this);

        btn4 =  findViewById(R.id.fiveguys);
        btn4.setOnClickListener(AmericanRestActivity.this);

        btn5 =   findViewById(R.id.arbys);
        btn5.setOnClickListener(AmericanRestActivity.this);

    }

    public void onClick(View view) {
        SharedPreferences mPref= this.getSharedPreferences("session", MODE_PRIVATE);
        if (view.getId() == R.id.mcdonald) {

            restuName = "McDonalds";

            mPref.edit().putString("session_id", restuName).apply();


            startActivity(new Intent(AmericanRestActivity.this, AmericanMenuActivity.class));
        } else if (view.getId() == R.id.bking) {
            restuName = "Burger King";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(AmericanRestActivity.this, AmericanMenuActivity.class));
        }else if (view.getId() == R.id.wendy) {
            restuName = "Wendys";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(AmericanRestActivity.this, AmericanMenuActivity.class));
        }else if (view.getId() == R.id.fiveguys) {
            restuName = "Five Guys";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(AmericanRestActivity.this, AmericanMenuActivity.class));
        }else if (view.getId() == R.id.arbys) {
            restuName = "Arbys";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(AmericanRestActivity.this, AmericanMenuActivity.class));
        }

    }
}