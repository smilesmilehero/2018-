package com.example.jordy.tarot;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import android.view.ViewDebug;
import android.widget.Toast;

public class bgmusicService extends Service {
    private boolean Running=false;
    private String data="預設資訊！！！";
    public bgmusicService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        data=intent.getStringExtra("data");//這裡的intent是引數裡的，不是自定義的
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onCreate() {
        super.onCreate();
        Running=true;
        new Thread(){
            @Override
            public void run() {
                super.run();
                while (Running){
                    System.out.println(data);
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Running=false;
    }
}
