package com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ.Au;

public class ReZ implements View.OnTouchListener {
    private boolean Au;
    private boolean JQp;
    private float PjT;
    private float ReZ;
    private boolean SM;
    private int XX;
    private float Zh;
    private float cr;
    private Au cz;

    public ReZ(Au au0) {
        this(au0, 5);
    }

    public ReZ(Au au0, int v) {
        this.XX = 5;
        this.Au = true;
        this.cz = au0;
        if(v > 0) {
            this.XX = v;
        }
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        if(this.SM) {
            return true;
        }
        switch(motionEvent0.getAction()) {
            case 0: {
                this.PjT = motionEvent0.getX();
                this.Zh = motionEvent0.getY();
                return true;
            }
            case 1: {
                if(!this.JQp && !this.Au) {
                    return false;
                }
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                int v = XX.Zh(cr.PjT(), Math.abs(this.cr - this.PjT));
                if(this.cr > this.PjT && v > this.XX) {
                    Au au0 = this.cz;
                    if(au0 != null) {
                        au0.PjT();
                        this.SM = true;
                    }
                }
                if(Math.abs(f - this.PjT) < 8.0f || Math.abs(f1 - this.Zh) < 8.0f) {
                    Au au1 = this.cz;
                    if(au1 != null) {
                        au1.Zh();
                        this.SM = true;
                        return true;
                    }
                }
                break;
            }
            case 2: {
                this.cr = motionEvent0.getX();
                this.ReZ = motionEvent0.getY();
                if(Math.abs(this.cr - this.PjT) > 10.0f) {
                    this.JQp = true;
                }
                if(Math.abs(this.cr - this.PjT) > 8.0f || Math.abs(this.ReZ - this.Zh) > 8.0f) {
                    this.Au = false;
                }
                int v1 = XX.Zh(cr.PjT(), Math.abs(this.cr - this.PjT));
                if(this.cr > this.PjT && v1 > this.XX) {
                    Au au2 = this.cz;
                    if(au2 != null) {
                        au2.PjT();
                        this.SM = true;
                        return true;
                    }
                }
                break;
            }
            default: {
                return true;
            }
        }
        return true;
    }
}

