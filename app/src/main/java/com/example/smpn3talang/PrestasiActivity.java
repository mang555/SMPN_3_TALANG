package com.example.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrestasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prestasi);
    }

    public void album8(View view) {
        Intent intent = new Intent(PrestasiActivity.this, album8Activity.class);
        startActivity(intent);
    }

    public void album7(View view) {
        Intent intent = new Intent(PrestasiActivity.this, album7Activity.class);
        startActivity(intent);
    }

    public void album9(View view) {
        Intent intent = new Intent(PrestasiActivity.this, album9Activity.class);
        startActivity(intent);
    }
}