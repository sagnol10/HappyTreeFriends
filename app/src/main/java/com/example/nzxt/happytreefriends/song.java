package com.example.nzxt.happytreefriends;

import android.app.Application;
import android.media.MediaPlayer;

/**
 * Created by NZXT on 5/22/2017.
 */

public class song extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        MediaPlayer mp = MediaPlayer.create(this, R.raw.htf);
        mp.start();
        mp.setLooping(true);

    }
}
