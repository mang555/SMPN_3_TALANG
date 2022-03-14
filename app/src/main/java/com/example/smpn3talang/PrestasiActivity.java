package com.example.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class PrestasiActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.sldrvw,
            R.drawable.sldrvw1,
            R.drawable.viewsld,
            R.drawable.viewsld1,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prestasi);
        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
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