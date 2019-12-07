package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentConfirmActivity extends AppCompatActivity implements View.OnClickListener{
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_confirm);

        btn1 =(Button) findViewById(R.id.confirm2);
        btn1.setOnClickListener(PaymentConfirmActivity.this);
    }


    public void onClick(View view) {

        startActivity(new Intent(PaymentConfirmActivity.this, OrderConfirmationActivity.class));

    }
}
