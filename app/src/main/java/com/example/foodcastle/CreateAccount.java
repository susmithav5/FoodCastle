package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccount extends AppCompatActivity implements View.OnClickListener {
    Button btnClickMe;
    Button btnLogin;
    EditText editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        btnClickMe = (Button) findViewById(R.id.submit);
        btnClickMe.setOnClickListener(CreateAccount.this);
    }


    public void onClick(View view) {

            editName  = (EditText) findViewById(R.id.firstName);
            String name = editName.getText().toString();
            Intent intent = new Intent(getApplicationContext(), Search.class);
            intent.putExtra("firstName1", name);
            startActivity(intent);
//            startActivity(new Intent(LoginActivity.this, Search.class));

    }
}
