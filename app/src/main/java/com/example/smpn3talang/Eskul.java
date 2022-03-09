package com.example.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.SliderView;

public class Eskul extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.hdrsp,
            R.drawable.hdr,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eskul);
    }

    public void osis(View view) {
    }

    public void pramuka(View view) {
    }

    public void futsal(View view) {
    }

    public void pmr(View view) {
    }

    public void bulutangkis(View view) {
    }
}