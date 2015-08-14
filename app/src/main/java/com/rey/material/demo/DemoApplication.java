package com.rey.material.demo;

import android.app.Application;
import android.content.Context;
import android.os.Build;

import com.rey.material.app.ThemeManager;

/**
 * Created by Rey on 5/22/2015.
 */
public class DemoApplication extends Application{



    @Override public void onCreate() {
        super.onCreate();
        if(BuildConfig.DEBUG)
        ThemeManager.init(this, 2, 0, null);
    }
}
