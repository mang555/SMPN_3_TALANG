package com.example.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FutsalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futsal);
    }

    public void album9(View view) {
        Intent intent = new Intent(FutsalActivity.this, album9Activity.class);
        startActivity(intent);
    }
}