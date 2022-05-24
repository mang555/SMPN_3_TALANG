package com.profil.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SilatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silat);
    }

    public void album11(View view) {
        Intent intent = new Intent(SilatActivity.this, Album11Activity.class);
        startActivity(intent);
    }
}