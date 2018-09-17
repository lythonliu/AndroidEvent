package com.dongnao.alvin.androidevent;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends com.lythonliu.LinkActivity {
    @Override
    public String getAppName(){
        return BuildConfig.APP_NAME;
    }
    DavidButton button;
    private static String TAG ="tuch";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (DavidButton) findViewById(R.id.btn_content);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Message message;
//        AccessibilityService accessibilityService;
        Log.i(TAG,"   MainActivity    dispatchTouchEvent   "+  ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG,"   MainActivity    onTouchEvent   "+  event.getAction());
        return super.onTouchEvent(event);
    }
}
