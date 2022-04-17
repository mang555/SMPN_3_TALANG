package com.example.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PmrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmr);
    }

    public void album8(View view) {
        Intent intent = new Intent(PmrActivity.this, album8Activity.class);
        startActivity(intent);
    }
}