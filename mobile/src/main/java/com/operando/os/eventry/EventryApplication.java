package com.operando.os.eventry;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

public class EventryApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
