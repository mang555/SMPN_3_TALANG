package com.example.smpn3talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Buku9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku9);
    }

    public void mat7(View view) {
        goToUrl("https://drive.google.com/file/d/1QXpoCmuE9qx21xv11D5u2nntsGpC6zUQ/view?usp=sharing");
    }

    public void mat72(View view) {
        goToUrl("https://drive.google.com/file/d/1QXpoCmuE9qx21xv11D5u2nntsGpC6zUQ/view?usp=sharing");
    }

    public void ipa1kls7(View view) {
        goToUrl("https://drive.google.com/file/d/1QXpoCmuE9qx21xv11D5u2nntsGpC6zUQ/view?usp=sharing");
    }

    public void ipa2kls7(View view) {
        goToUrl("https://drive.google.com/file/d/1QXpoCmuE9qx21xv11D5u2nntsGpC6zUQ/view?usp=sharing");
    }

    public void pra1kls7(View view) {
        goToUrl("https://drive.google.com/file/d/1QXpoCmuE9qx21xv11D5u2nntsGpC6zUQ/view?usp=sharing");
    }

    public void pra2kls7(View view) {
        goToUrl("https://drive.google.com/file/d/1QXpoCmuE9qx21xv11D5u2nntsGpC6zUQ/view?usp=sharing");
    }

    public void indkls7(View view) {
    }

    public void ingkls7(View view) {
    }

    public void ppkn7(View view) {
    }

    public void paikls7(View view) {
    }

    public void penjas7(View view) {
    }

    public void sbykls7(View view) {
    }

    public void ipskls7(View view) {
    }
    private void goToUrl (String url){
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}