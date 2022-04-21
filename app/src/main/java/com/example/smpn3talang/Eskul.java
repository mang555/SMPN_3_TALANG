package com.example.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;


public class Eskul extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.sldrvw,
            R.drawable.sldrvw1,
            R.drawable.viewsld,
            R.drawable.viewsld1,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eskul);
        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

    }


    public void pramuka(View view) {
        Intent intent = new Intent(Eskul.this, PramukaActivity.class);
        startActivity(intent);
    }

    public void futsal(View view) {
        Intent intent = new Intent(Eskul.this, FutsalActivity.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(Eskul.this, PmrActivity.class);
        startActivity(intent);
    }

    public void bulutangkis(View view) {
        Intent intent = new Intent(Eskul.this, VoliActivity.class);
        startActivity(intent);
    }

    public void silat(View view) {
        Intent intent = new Intent(Eskul.this, SilatActivity.class);
        startActivity(intent);
    }

    public void jurnalis(View view) {
        Intent intent = new Intent(Eskul.this, JurnalisActivity.class);
        startActivity(intent);
    }

    public void paskib(View view) {
        Intent intent = new Intent(Eskul.this, PaskibActivity.class);
        startActivity(intent);
    }
}