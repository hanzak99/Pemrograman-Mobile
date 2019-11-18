package com.hanzpro.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowText extends AppCompatActivity {

    TextView tv;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_text);

        tv=findViewById(R.id.tv_showText);
        str=getIntent().getExtras().getString("isiData");
        tv.setText(str);
    }
}
