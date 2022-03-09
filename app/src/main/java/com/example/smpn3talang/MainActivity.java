package com.example.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profil(View view) {
        Intent intent = new Intent(MainActivity.this, Profile.class);
        startActivity(intent);
    }

    public void guru(View view) {

    }

    public void ekskul(View view) {
        Intent intent = new Intent(MainActivity.this, Eskul.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
    }

    public void prestasi(View view) {
    }

    public void perpus(View view) {
        Intent intent = new Intent(MainActivity.this, Perpus.class);
        startActivity(intent);
    }
}