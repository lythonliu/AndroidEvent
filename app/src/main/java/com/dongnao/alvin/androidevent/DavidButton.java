package com.dongnao.alvin.androidevent;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2017/6/2 0002.
 */

public class DavidButton  extends View {
    public DavidButton(Context context) {
        super(context);
    }

    public DavidButton(Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);
        getParent().requestDisallowInterceptTouchEvent(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("tuch","  DavidButton     onTouchEvent  "+event.getAction());
        return  false;
    }
}
