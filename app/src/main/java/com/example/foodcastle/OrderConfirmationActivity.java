package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderConfirmationActivity extends AppCompatActivity implements View.OnClickListener{
Button btn1;
    public int counter=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmation);
        btn1 =(Button) findViewById(R.id.thanksBtn);
        btn1.setOnClickListener(OrderConfirmationActivity.this);

        final TextView counttime=findViewById(R.id.counttime);
        new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                counttime.setText(String.valueOf(counter));
                counter--;
            }
            @Override
            public void onFinish() {
                counttime.setText("Your Order is Ready!");
            }
        }.start();
    }

    public void onClick(View view) {

        startActivity(new Intent(OrderConfirmationActivity.this, ThankYouActivity.class));
      }
}
