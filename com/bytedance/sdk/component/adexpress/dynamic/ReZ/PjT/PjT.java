package com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ.Au;
import java.lang.ref.SoftReference;

public class PjT implements View.OnTouchListener {
    private final int Au;
    private SoftReference DWo;
    private int JQp;
    private float PjT;
    private static int ReZ = 10;
    private final int SM;
    private long XX;
    private float Zh;
    private Au cr;
    private RectF cz;

    static {
    }

    public PjT(Au au0, int v, ViewGroup viewGroup0) {
        this.JQp = PjT.ReZ;
        this.cz = new RectF();
        this.XX = 0L;
        this.Au = 200;
        this.SM = 3;
        this.DWo = new SoftReference(null);
        this.cr = au0;
        if(v > 0) {
            this.JQp = v;
        }
        if(viewGroup0 != null) {
            viewGroup0.post(new Runnable() {
                final PjT Zh;

                @Override
                public void run() {
                    SoftReference softReference0 = new SoftReference(viewGroup0);
                    PjT.this.DWo = softReference0;
                }
            });
        }
    }

    private RectF PjT(View view0) {
        if(view0 == null) {
            return new RectF();
        }
        int[] arr_v = new int[2];
        view0.getLocationOnScreen(arr_v);
        int v = arr_v[0];
        return new RectF(((float)v), ((float)arr_v[1]), ((float)(v + view0.getWidth())), ((float)(arr_v[1] + view0.getHeight())));
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.cz = this.PjT(((View)this.DWo.get()));
                this.PjT = motionEvent0.getRawX();
                this.Zh = motionEvent0.getRawY();
                this.XX = System.currentTimeMillis();
                return true;
            }
            case 1: {
                if(this.cz != null && !this.cz.contains(this.PjT, this.Zh)) {
                    return false;
                }
                float f = motionEvent0.getRawX();
                float f1 = motionEvent0.getRawY();
                float f2 = Math.abs(f - this.PjT);
                float f3 = Math.abs(f1 - this.Zh);
                if(f2 >= ((float)this.JQp) && f3 >= ((float)this.JQp)) {
                    Au au0 = this.cr;
                    if(au0 != null) {
                        au0.PjT();
                        return true;
                    }
                }
                else if(System.currentTimeMillis() - this.XX < 200L || f2 < 3.0f && f3 < 3.0f) {
                    Au au1 = this.cr;
                    if(au1 != null) {
                        au1.PjT();
                        return true;
                    }
                }
                return true;
            }
            default: {
                return true;
            }
        }
    }
}

