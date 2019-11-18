package com.hanzpro.kitabhadits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class detailListKitab extends AppCompatActivity {
    private int kitab_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Kitab> listKitab = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_kitab);


        kitab_id = getIntent().getIntExtra("kitab_id", 0);
        tvName = findViewById(R.id.nama_kitab);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listKitab.addAll(dataKitab.getListData());
        getSupportActionBar().setTitle(listKitab.get(kitab_id).getName());
        setLayout();
    }

    private void setLayout() {
        tvName.setText(listKitab.get(kitab_id).getName());
        tvDesc.setText(listKitab.get(kitab_id).getDescription());
        Glide.with(this).load(listKitab.get(kitab_id).getPhoto()).apply(new RequestOptions().fitCenter()).into(imgDetail);
    }

}
