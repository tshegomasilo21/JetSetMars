package com.example.user.jetsetmars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class category extends AppCompatActivity {

    int position = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
    }

    public void onClickMarsDetails(View v)
    {
        position = 1;
        Intent intent = new Intent(category.this,parameters.class);
        intent.putExtra("bucketno", position);
        startActivity(intent);
    }
    public void onClickMoonDetails(View v)
    {
        position = 2;
        Intent intent = new Intent(category.this,parameters.class);
        intent.putExtra("bucketno", position);
        startActivity(intent);
    }
    public void onClickEarthDetails(View v)
    {
        position = 3;
        Intent intent = new Intent(category.this,parameters.class);
        intent.putExtra("bucketno", position);
        startActivity(intent);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
