package com.example.aitana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        Typeface myFont = Typeface.createFromAsset(getAssets(),"BabySnowman.ttf");
        TextView texto = (TextView) findViewById(R.id.textoSplash);
        texto.setTypeface(myFont);

        TextView texto1= (TextView) findViewById(R.id.textoSplash2);
        texto1.setTypeface(myFont);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.splash);
        texto.startAnimation(animacion);

        Animation animacion2 = AnimationUtils.loadAnimation(this,R.anim.splash2);
        texto1.startAnimation(animacion2);

        Animation animacion1 = AnimationUtils.loadAnimation(this,R.anim.fade_in_splash);
        View circulo = findViewById(R.id.circularFillableLoaders);
        circulo.startAnimation(animacion1);

        animacion2.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.gif_in,R.anim.splash_out);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}