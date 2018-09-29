package com.asitrack.loginresisterui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {
    private Activity context;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
    }

    public Activity getContext() {
        return context;
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }

    public void setContext(Activity context) {
        this.context = context;
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
