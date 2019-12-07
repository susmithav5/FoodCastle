package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class PaymentActivity extends AppCompatActivity  implements View.OnClickListener{
    TextView editText1;
    EditText editText2;
    EditText textViewResult;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        btn1 =(Button) findViewById(R.id.payNow);
        btn1.setOnClickListener(PaymentActivity.this);


        editText1 = (TextView) findViewById(R.id.totalAmtOld);
        Intent intent = getIntent();

        String str = intent.getStringExtra("totalAmtOld");

        // display the string into textView
        editText1.setText(str);

       // System.out.println("***********PaymentActivity******************************"+editText1.getText());

        editText2 = (EditText) findViewById(R.id.promoAmt);
        textViewResult = (EditText) findViewById(R.id.netAmt);
        textViewResult.setText(str);
        editText1.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub
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
                // TODO Auto-generated method stub

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

        startActivity(new Intent(PaymentActivity.this, PaymentConfirmActivity.class));

    }

    private String addNumbers() {
        double number1=0.0;
        double number2=0.0;
        if(editText1.getText().toString() != "" && editText1.getText().length() > 0) {
            number1 =Double.valueOf(editText1.getText().toString());
        } else {
            number1 = 0.0;
        }
        if(editText2.getText().toString() != "" && editText2.getText().length() > 0) {
            number2 = Integer.parseInt(editText2.getText().toString());
        } else {
            number2 = 0.0;
        }

        return  DecimalFormat.getNumberInstance().format(number1 - number2);
    }
}
