package com.example.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Eskul extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eskul);

    }


    public void pramuka(View view) {
        Intent intent = new Intent(Eskul.this, PramukaActivity.class);
        startActivity(intent);
    }

    public void futsal(View view) {
        Intent intent = new Intent(Eskul.this, FutsalActivity.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(Eskul.this, PmrActivity.class);
        startActivity(intent);
    }

    public void bulutangkis(View view) {
        Intent intent = new Intent(Eskul.this, VoliActivity.class);
        startActivity(intent);
    }
}