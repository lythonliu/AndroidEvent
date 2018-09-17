package com.dongnao.alvin.androidevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by Administrator on 2017/6/2 0002.
 */

public class DavidViewGroup extends RelativeLayout {
    private static String TAG ="tuch";
    public DavidViewGroup(Context context) {
        super(context);
    }

    public DavidViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG,"  DavidViewGroup    onTouchEvent   "+event.getAction());
        //不让父控件拦截
//        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(event);
    }

    /**
     * 拦截方法
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i(TAG,"  DavidViewGroup    onInterceptTouchEvent  "+ev.getAction());

        return true;
    }





    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        Log.i(TAG,"  DavidViewGroup    dispatchTouchEvent"+  ev.getAction());
//        return true;
        return super.dispatchTouchEvent(ev);
    }


}
