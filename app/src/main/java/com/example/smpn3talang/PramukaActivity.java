package com.example.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PramukaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pramuka);
    }

    public void album7(View view) {
        Intent intent = new Intent(PramukaActivity.this, album7Activity.class);
        startActivity(intent);
    }
}