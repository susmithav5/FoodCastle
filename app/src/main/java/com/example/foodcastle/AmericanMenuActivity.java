package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.travijuu.numberpicker.library.NumberPicker;

import java.text.DecimalFormat;

public class AmericanMenuActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    NumberPicker np1,np2,np3,np4,np5,np6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_american_menu);


        //Get the widgets reference from XML layout
//        final TextView tv = (TextView) findViewById(R.id.tv);
          np1 = (NumberPicker) findViewById(R.id.numberPickerBigmac);

        //Set TextView text color
//        tv.setTextColor(Color.parseColor("#ffd32b3b"));

        //Populate NumberPicker values from minimum and maximum value range
        //Set the minimum value of NumberPicker
        np1.setMax(15);
        np1.setMin(0);
        np1.setUnit(1);
        np1.setValue(0);

          np2 = (NumberPicker) findViewById(R.id.numberPickerDblQtr);
        np2.setMax(15);
        np2.setMin(0);
        np2.setUnit(1);
        np2.setValue(0);

          np3 = (NumberPicker) findViewById(R.id.numberPickerchicBtr);
        np3.setMax(15);
        np3.setMin(0);
        np3.setUnit(1);
        np3.setValue(0);

          np4 = (NumberPicker) findViewById(R.id.numberPickerbbqChk);
        np4.setMax(15);
        np4.setMin(0);
        np4.setUnit(1);
        np4.setValue(0);

          np5 = (NumberPicker) findViewById(R.id.numberPickerFries);
        np5.setMax(15);
        np5.setMin(0);
        np5.setUnit(1);
        np5.setValue(0);

          np6 = (NumberPicker) findViewById(R.id.numberPickerCokes);
        np6.setMax(15);
        np6.setMin(0);
        np6.setUnit(1);
        np6.setValue(0);

        btn1 = (Button) findViewById(R.id.continue1);
        btn1.setOnClickListener(AmericanMenuActivity.this);


    }

    public void onClick(View view) {
        int n1 =np1.getValue();
        int n2 =np2.getValue();
        int n3 =np3.getValue();
        int n4 =np4.getValue();
        int n5 =np5.getValue();
        int n6 =np6.getValue();

        Double amount=0.00;

        if(n1>0){
            amount+=n1*9.99;
        }
        if(n2>0){
            amount+=n2*8.99;
        }

        if(n3>0){
            amount+=n3*8.99;
        }

        if(n4>0){
            amount+=n4*8.99;
        }

        if(n5>0){
            amount+=n5*2.99;
        }

        if(n6>0){
            amount+=n6*1.99;
        }
        String total2 = DecimalFormat.getNumberInstance().format(amount);
        total2 = new DecimalFormat("#.0#").format(amount);
        System.out.println("amount is : "+total2);

        Intent intent = new Intent(getApplicationContext(), MyCartActivity.class);
        intent.putExtra("subAmount", total2);
        startActivity(intent);
//        startActivity(new Intent(AmericanMenuActivity.this, MyCartActivity.class));

    }
}
