package com.example.webservicemvvm.utils;

import android.app.Application;
import android.content.Context;

public class GlobalActivity extends Application {
    private static GlobalActivity  appContext;
    public void onCreate() {
        super.onCreate();
        appContext = this;
        /* If you has other classes that need context object to initialize when application is created,
         you can use the appContext here to process. */
    }

    public  GlobalActivity getContext() {
        return appContext;
    }
}