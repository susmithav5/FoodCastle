package com.example.foodcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnClickMe;
    Button btnLogin;
    EditText editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnClickMe = (Button) findViewById(R.id.register);

        btnClickMe.setOnClickListener(LoginActivity.this);


        btnLogin= (Button) findViewById(R.id.signin);
        btnLogin.setOnClickListener(LoginActivity.this);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.signin) {
            editName  = (EditText) findViewById(R.id.username1);
            String name = editName.getText().toString();
            Intent intent = new Intent(getApplicationContext(), Search.class);
            intent.putExtra("firstName1", name);
            startActivity(intent);
//            startActivity(new Intent(LoginActivity.this, Search.class));
        } else if (view.getId() == R.id.register) {
            startActivity(new Intent(LoginActivity.this, CreateAccount.class));
        }
    }
}
