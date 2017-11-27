package com.example.nzxt.happytreefriends;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Halaman_Utama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman__utama);

        //pemindahan activity
        Handler tunda = new Handler();
        tunda.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Halaman_Utama.this, Friend.class));
                finish();
            }
        }, 10000);


    }
}
