package com.hanzpro.kitabhadits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKitab;
    private ArrayList<Kitab> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("KITAB-KITAB HADITS");
        }
        rvKitab = findViewById(R.id.rv_kitab_hadits);
        rvKitab.setHasFixedSize(true);

        list.addAll(dataKitab.getListData());
        showRecyclerList();
    }

    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profile_icon:
                Intent activity_profile = new Intent(this, Profile.class);
                startActivity(activity_profile);
                return true;
            default:
                return true;
        }
    }

    private void showRecyclerList(){
        rvKitab.setLayoutManager(new LinearLayoutManager(this));
        CardKitabAdapter cardKitabAdapter = new CardKitabAdapter(this,list);
        rvKitab.setAdapter(cardKitabAdapter);
    }
}
