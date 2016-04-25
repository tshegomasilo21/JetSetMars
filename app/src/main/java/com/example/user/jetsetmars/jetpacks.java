package com.example.user.jetsetmars;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class jetpacks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jetpacks);

        /*ImageView img1 = (ImageView) findViewById(R.id.imgJb9);
        ImageView img2 = (ImageView) findViewById(R.id.imgP11);
        ImageView img3 = (ImageView) findViewById(R.id.imgP12);

        Picasso.with(getApplicationContext()).load(R.drawable.jet1).into(img1);
        Picasso.with(getApplicationContext()).load(R.drawable.jet).into(img2);
        Picasso.with(getApplicationContext()).load(R.drawable.jet2).into(img3);*/
    }


    public void onClick_JB9(View v)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=f3AwBSwFV2I")));
        Log.i("Video", "Video Playing....");

    }
    public void onClick_P11(View v)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=2TBndcBjQFM")));
        Log.i("Video", "Video Playing....");

    }
    public void onClick_P12(View v)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dailymail.co.uk/video/news/video-1200932/Watch-latest-Martin-Jetpack-action-test-flight.html")));
        Log.i("Video", "Video Playing....");
    }
}
