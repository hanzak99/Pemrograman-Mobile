package com.hanzpro.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_editText extends AppCompatActivity {

    Button btnShow;
    EditText edttxt;
    String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        btnShow=findViewById(R.id.btnshow);
        edttxt=findViewById(R.id.edittext);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tampilText = new Intent(activity_editText.this,ShowText.class);
                str = edttxt.getText().toString();
                tampilText.putExtra("isiData",str);
                startActivity(tampilText);
            }
        });
    }
}
