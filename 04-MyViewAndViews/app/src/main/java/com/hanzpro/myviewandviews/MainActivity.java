package com.hanzpro.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_donasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_donasi = findViewById(R.id.BtnDonasi);
        btn_donasi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.BtnDonasi:
                Intent donasi = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(donasi);
                break;
        }
    }
}
