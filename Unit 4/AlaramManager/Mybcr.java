package com.example.alarammanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class Mybcr extends BroadcastReceiver {

    MediaPlayer mp ;

    @Override
    public void onReceive(Context context, Intent intent) {

        mp = MediaPlayer.create(context,R.);
        mp.start();
        Toast.makeText(context, "Alarm.......", Toast.LENGTH_SHORT).show();
    }
}
