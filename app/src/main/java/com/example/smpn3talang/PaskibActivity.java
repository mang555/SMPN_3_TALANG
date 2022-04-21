package com.example.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PaskibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paskib);
    }

    public void album13(View view) {
        Intent intent = new Intent(PaskibActivity.this, Album13Activity.class);
        startActivity(intent);
    }
}