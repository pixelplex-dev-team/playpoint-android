package com.pixelplex.playpointandroid;

import android.app.Application;
import com.pixelplex.playpointcore.Logger;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.initialize(getApplicationContext());
    }
}
