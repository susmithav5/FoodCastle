package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class ThankYouActivity extends AppCompatActivity implements View.OnClickListener{
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);

        btn1 =(Button) findViewById(R.id.home1);
        btn1.setOnClickListener(ThankYouActivity.this);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // TODO: Your application init goes here.
                Intent mInHome = new Intent(ThankYouActivity.this, MainActivity.class);
                ThankYouActivity.this.startActivity(mInHome);
                ThankYouActivity.this.finish();
            }
        }, 3000);


    }

    public void onClick(View view) {

        startActivity(new Intent(ThankYouActivity.this, MainActivity.class));

    }
}
