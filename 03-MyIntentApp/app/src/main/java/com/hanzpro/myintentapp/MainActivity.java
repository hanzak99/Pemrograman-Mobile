package com.hanzpro.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    Button btnMoveActivity,btnMoveActivityWithData, btnDial, btnWebsite, btnEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity= findViewById(R.id.btnmove_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData= findViewById(R.id.btnmove_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btnDial= findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);

        btnWebsite=findViewById(R.id.btn_website);
        btnWebsite.setOnClickListener(this);

        btnEditText=findViewById(R.id.btnedit_text);
        btnEditText.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnmove_activity:
                Intent moveIntent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btnmove_data:
                Intent moveData = new Intent (MainActivity.this, MoveActivityWithData.class);
                moveData.putExtra(MoveActivityWithData.EXTRA_NAME,"Hanif Dzaky");
                moveData.putExtra(MoveActivityWithData.EXTRA_AGE,20);
                startActivity(moveData);
                break;
            case R.id.btn_dial:
                String phoneNumber = "082324042608";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.btn_website:
                Intent openBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.polines.ac.id"));
                startActivity(openBrowser);
                break;
            case R.id.btnedit_text:
                Intent showEditText = new Intent(MainActivity.this, activity_editText.class);
                startActivity(showEditText);
                break;
        }
    }
}
