package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItalianRestActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2,btn3,btn4 ;

    String restuName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_rest);

        btn1 = findViewById(R.id.beppo);
        btn1.setOnClickListener(ItalianRestActivity.this);

        btn2 = findViewById(R.id.ogarden);
        btn2.setOnClickListener(ItalianRestActivity.this);

        btn3 = findViewById(R.id.romano);
        btn3.setOnClickListener(ItalianRestActivity.this);

        btn4 = findViewById(R.id.uno);
        btn4.setOnClickListener(ItalianRestActivity.this);


    }

    public void onClick(View view) {
        SharedPreferences mPref = this.getSharedPreferences("session", MODE_PRIVATE);
        if (view.getId() == R.id.beppo) {

            restuName = "Buca De Beppo";

            mPref.edit().putString("session_id", restuName).apply();


            startActivity(new Intent(ItalianRestActivity.this, AmericanMenuActivity.class));
        } else if (view.getId() == R.id.ogarden) {
            restuName = "Olive Garden";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(ItalianRestActivity.this, AmericanMenuActivity.class));
        } else if (view.getId() == R.id.romano) {
            restuName = "Romano";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(ItalianRestActivity.this, AmericanMenuActivity.class));
        } else if (view.getId() == R.id.uno) {
            restuName = "Uno Chicago Grill";

            mPref.edit().putString("session_id", restuName).apply();
            startActivity(new Intent(ItalianRestActivity.this, AmericanMenuActivity.class));
        }
    }
}