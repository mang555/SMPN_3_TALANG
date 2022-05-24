package com.profil.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JurnalisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jurnalis);
    }

    public void album12(View view) {
        Intent intent = new Intent(JurnalisActivity.this, Album12Activity.class);
        startActivity(intent);
    }
}