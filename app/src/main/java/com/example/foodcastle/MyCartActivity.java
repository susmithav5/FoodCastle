package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MyCartActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editText1;
    EditText editText2;
    TextView textViewResult;
    TextView restResult;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);

        btn1 = (Button) findViewById(R.id.chkoutBtn);
        btn1.setOnClickListener(MyCartActivity.this);


        restResult= (TextView) findViewById(R.id.resturntName);
        SharedPreferences mPref= getSharedPreferences("session", MODE_PRIVATE);
        String restName= mPref.getString("session_id", null);
        System.out.println("**********cartactivity************************"+ restName);
       /* Intent k = getIntent();
        String restName = k.getStringExtra("restuName");*/
        restResult.setText(restName);

        editText1 = (EditText) findViewById(R.id.subAmount);
        Intent intent = getIntent();
        String str = intent.getStringExtra("subAmount");
        // display the string into textView
        editText1.setText(str);



        editText2 = (EditText) findViewById(R.id.deliveryFee);
        textViewResult = (TextView) findViewById(R.id.totalAmt);
        textViewResult.setText(str);
        editText1.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                textViewResult.setText(addNumbers());
            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {


            }

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                textViewResult.setText(addNumbers());

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });
    }

    public void onClick(View view) {
        String name = textViewResult.getText().toString();
        System.out.println("*****************************************"+name);
        Intent intent = new Intent(getApplicationContext(), PaymentActivity.class);
        intent.putExtra("totalAmtOld", name);
        startActivity(intent);
        //startActivity(new Intent(MyCartActivity.this, PaymentActivity.class));


    }

    private String addNumbers() {
        double number1=0.0;
        double number2=0.0;

        if( editText1.getText().length() > 0) {
            number1 = Double.valueOf(editText1.getText().toString());

        } else {
            number1 = 0.0;
        }
        if(editText2.getText().toString() != "" && editText2.getText().length() > 0) {
            number2 = Integer.parseInt(editText2.getText().toString());
        } else {
            number2 = 0.0;
        }
        return  DecimalFormat.getNumberInstance().format(number1 + number2);
//        return Integer.toString(number1 + number2);
    }
}
