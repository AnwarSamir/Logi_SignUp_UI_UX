package com.asitrack.loginresisterui;

import android.app.Application;



import io.github.inflationx.calligraphy3.CalligraphyConfig;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.viewpump.ViewPump;

public class AppController extends Application {
    private static  AppController ourInstance = new AppController();

    public static synchronized AppController getInstance() {
        return ourInstance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        ourInstance = this;
        ViewPump.init(ViewPump.builder()
                .addInterceptor(new CalligraphyInterceptor(
                        new CalligraphyConfig.Builder()
                                .setDefaultFontPath("fonts/Comfortaa-Bold.ttf")
                                .setFontAttrId(R.attr.fontPath)
                                .build()))
                .build());
    }




}
