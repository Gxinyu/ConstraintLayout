package com.gexinyu.constraintlayout;

import android.app.Application;


public class ConstraintlayoutApplication extends Application {

    public static ConstraintlayoutApplication instance = null;


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }


    public static ConstraintlayoutApplication getDefault() {
        if (instance == null) {
            synchronized (ConstraintlayoutApplication.class) {
                if (instance == null) {
                    instance = new ConstraintlayoutApplication();
                }
            }
        }
        return instance;
    }


}
