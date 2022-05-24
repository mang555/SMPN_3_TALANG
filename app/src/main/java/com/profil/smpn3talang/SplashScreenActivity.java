package com.profil.smpn3talang;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.profil.smpn3talang.MainActivity;
import com.profil.smpn3talang.R;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        final Handler handler = new Handler();

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(intent);

                    Toast.makeText(SplashScreenActivity.this,"LOGIN SUCCESS",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(SplashScreenActivity.this,"SOMETHING WRONG",Toast.LENGTH_SHORT).show();
            }
        });

    }
}


