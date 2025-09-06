package com.bytedance.adsdk.ugeno.SM.Zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.cr;
import java.util.Map;

public class PjT extends FrameLayout {
    private cr PjT;
    private Map Zh;

    public PjT(Context context0) {
        super(context0);
    }

    public void PjT(cr cr0) {
        this.PjT = cr0;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        cr cr0 = this.PjT;
        if(cr0 != null) {
            cr0.XX();
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cr cr0 = this.PjT;
        if(cr0 != null) {
            cr0.Au();
        }
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        return this.Zh == null || !this.Zh.containsKey(4) ? super.onInterceptTouchEvent(motionEvent0) : true;
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        cr cr0 = this.PjT;
        if(cr0 != null) {
            cr0.cz();
        }
        super.onLayout(z, v, v1, v2, v3);
        cr cr1 = this.PjT;
        if(cr1 != null) {
            cr1.PjT(v, v1, v2, v3);
        }
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        cr cr0 = this.PjT;
        if(cr0 == null) {
            super.onMeasure(v, v1);
        }
        else {
            int[] arr_v = cr0.PjT(v, v1);
            super.onMeasure(arr_v[0], arr_v[1]);
        }
        cr cr1 = this.PjT;
        if(cr1 != null) {
            cr1.JQp();
        }
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        cr cr0 = this.PjT;
        if(cr0 != null) {
            cr0.Zh(v, v1, v2, v3);
        }
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setEventMap(Map map0) {
        this.Zh = map0;
    }
}

