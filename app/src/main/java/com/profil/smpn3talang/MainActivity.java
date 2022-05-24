package com.profil.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profil(View view) {
        Intent intent = new Intent(MainActivity.this, Profile.class);
        startActivity(intent);
    }

    public void guru(View view) {
        Intent intent = new Intent(MainActivity.this, GuruActivity.class);
        startActivity(intent);
    }

    public void ekskul(View view) {
        Intent intent = new Intent(MainActivity.this, Eskul.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }

    public void prestasi(View view) {
        Intent intent = new Intent(MainActivity.this, PrestasiActivity.class);
        startActivity(intent);
    }

    public void perpus(View view) {
        Intent intent = new Intent(MainActivity.this, Perpus.class);
        startActivity(intent);
    }

    public void absen(View view) {
        Intent intent = new Intent(MainActivity.this, AbsenActivity.class);
        startActivity(intent);
    }

    public void GGL(View view) {
        goToUrl("https://smp3talang.com/");
    }

    public void FB(View view) {
        goToUrl("https://m.facebook.com/smp3talang/");
    }

    public void YT(View view) {
        goToUrl("https://youtube.com/channel/UCMB4WVeBVI0X0KjMwfIw9uw");
    }

    public void IG(View view) {
        goToUrl("https://instagram.com/spegalanghitzz_?utm_medium=copy_link");
    }
    private void goToUrl (String url){
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


}