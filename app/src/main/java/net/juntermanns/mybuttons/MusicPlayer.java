package net.juntermanns.mybuttons;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;



public class MusicPlayer extends Service {

    MediaPlayer mp;
    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }
    public void onCreate()
    {
        mp = MediaPlayer.create(this, R.raw.arexbeat);
        mp.setLooping(false);
        mp.setVolume(44,22);

    }
    public void onDestroy()
    {
        mp.stop();
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        mp.start();
        return Service.START_NOT_STICKY;
    }
}