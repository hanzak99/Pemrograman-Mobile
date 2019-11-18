package com.hanzpro.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnregister = findViewById(R.id.BtnRegister);
        btnregister.setOnClickListener(this);

    }
    public void onClick (View view){
        switch (view.getId()) {
            case R.id.BtnRegister:
                Intent register = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(register);
                break;
        }
    }
}
