package com.example.aitana;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webView);
       webView.loadUrl("file:///android_asset/Nieve.gif");

        /* VideoView videoView = (VideoView) findViewById(R.id.video);
        Uri path = Uri.parse("android.resource://com.example.reproducirvideo/" + R.raw.nieve);
        videoView.setVideoURI(path);
        videoView.start();

         */

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.fade_in_splash);
        TextView titulo = (TextView) findViewById(R.id.titulo);
        titulo.startAnimation(animacion);

        Animation animacion1 = AnimationUtils.loadAnimation(this,R.anim.up_down);
        TextView texto1 = (TextView) findViewById(R.id.texto1);
        texto1.startAnimation(animacion1);

        Animation animacion2 = AnimationUtils.loadAnimation(this,R.anim.left_to_right);
        TextView corazon = (TextView) findViewById(R.id.corazon);
        corazon.startAnimation(animacion2);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.tan_solo_tu);
        mediaPlayer.start();



    }

}