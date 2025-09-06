package com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ.Au;

public class cz implements View.OnTouchListener {
    private Au JQp;
    private float PjT;
    private static int ReZ = 10;
    private float Zh;
    private boolean cr;

    static {
    }

    public cz(Au au0) {
        this.JQp = au0;
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.PjT = motionEvent0.getX();
                this.Zh = motionEvent0.getY();
                return true;
            }
            case 1: {
                if(this.cr) {
                    this.cr = false;
                    return false;
                }
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                if(Math.abs(f - this.PjT) >= ((float)cz.ReZ) || Math.abs(f1 - this.Zh) >= ((float)cz.ReZ)) {
                    this.cr = false;
                    return true;
                }
                Au au0 = this.JQp;
                if(au0 != null) {
                    au0.PjT();
                    return true;
                }
                break;
            }
            case 2: {
                float f2 = motionEvent0.getX();
                float f3 = motionEvent0.getY();
                if(Math.abs(f2 - this.PjT) >= ((float)cz.ReZ) || Math.abs(f3 - this.Zh) >= ((float)cz.ReZ)) {
                    this.cr = true;
                    return true;
                }
                break;
            }
            case 3: {
                this.cr = false;
                return true;
            }
            default: {
                return true;
            }
        }
        return true;
    }
}

