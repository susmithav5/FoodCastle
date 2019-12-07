package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *
 */
public class IndianRestActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2,btn3,btn4,btn5;

    String restuName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_rest);


        btn1 =   findViewById(R.id.aromas);
        btn1.setOnClickListener(IndianRestActivity.this);

        btn2 =   findViewById(R.id.spicymint);
        btn2.setOnClickListener(IndianRestActivity.this);

        btn3 =   findViewById(R.id.karavali);
        btn3.setOnClickListener(IndianRestActivity.this);

        btn4 =  findViewById(R.id.maharaja);
        btn4.setOnClickListener(IndianRestActivity.this);

        btn5 =   findViewById(R.id.nirvana);
        btn5.setOnClickListener(IndianRestActivity.this);

    }

    public void onClick(View view) {
        SharedPreferences mPref= this.getSharedPreferences("session", MODE_PRIVATE);
        if (view.getId() == R.id.aromas) {

            restuName = "Aromas";

            mPref.edit().putString("session_id", restuName).apply();


            startActivity(new Intent(IndianRestActivity.this, AmericanMenuActivity.class));
        } else if (view.getId() == R.id.spicymint) {
            restuName = "Spicy Mint";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(IndianRestActivity.this, AmericanMenuActivity.class));
        }else if (view.getId() == R.id.karavali) {
            restuName = "Karavali";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(IndianRestActivity.this, AmericanMenuActivity.class));
        }else if (view.getId() == R.id.maharaja) {
            restuName = "Maharaja";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(IndianRestActivity.this, AmericanMenuActivity.class));
        }else if (view.getId() == R.id.nirvana) {
            restuName = "Nirvana";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(IndianRestActivity.this, AmericanMenuActivity.class));
        }

    }
}