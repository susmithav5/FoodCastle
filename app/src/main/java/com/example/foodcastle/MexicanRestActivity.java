package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MexicanRestActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2,btn3,btn4 ;

    String restuName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexican_rest);
        btn1 = findViewById(R.id.chilly);
        btn1.setOnClickListener(MexicanRestActivity.this);

        btn2 = findViewById(R.id.chipotle);
        btn2.setOnClickListener(MexicanRestActivity.this);

        btn3 = findViewById(R.id.moes);
        btn3.setOnClickListener(MexicanRestActivity.this);

        btn4 = findViewById(R.id.ontheborder);
        btn4.setOnClickListener(MexicanRestActivity.this);


    }

    public void onClick(View view) {
        SharedPreferences mPref = this.getSharedPreferences("session", MODE_PRIVATE);
        if (view.getId() == R.id.chilly) {

            restuName = "Chilly's";

            mPref.edit().putString("session_id", restuName).apply();


            startActivity(new Intent(MexicanRestActivity.this, AmericanMenuActivity.class));
        } else if (view.getId() == R.id.chipotle) {
            restuName = "Chipotle";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(MexicanRestActivity.this, AmericanMenuActivity.class));
        } else if (view.getId() == R.id.moes) {
            restuName = "Moes Grill";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(MexicanRestActivity.this, AmericanMenuActivity.class));
        } else if (view.getId() == R.id.ontheborder) {
            restuName = "On The Border";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(MexicanRestActivity.this, AmericanMenuActivity.class));
        }
    }

}
