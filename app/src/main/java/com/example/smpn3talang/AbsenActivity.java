package com.example.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AbsenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absen);


    }

    public void admin(View view) {
        Intent intent = new Intent(AbsenActivity.this, Absen2Activity.class);
        startActivity(intent);
    }

    public void absen(View view) {
        Intent intent = new Intent(AbsenActivity.this, AdminAbsenActivity.class);
        startActivity(intent);
    }
}