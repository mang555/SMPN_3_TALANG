package com.example.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Perpus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpus);
    }

    public void buku7(View view) {
        Intent intent = new Intent(Perpus.this, Buku7.class);
        startActivity(intent);
    }

    public void buku8(View view) {
        Intent intent = new Intent(Perpus.this, Buku8.class);
        startActivity(intent);
    }

    public void buku9(View view) {
        Intent intent = new Intent(Perpus.this, Buku9.class);
        startActivity(intent);
    }
}