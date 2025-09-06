package com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ.Au;

public class cr implements View.OnTouchListener {
    private boolean Au;
    private int DWo;
    private boolean JQp;
    private float PjT;
    private float ReZ;
    private Au SM;
    private float XX;
    private float Zh;
    private float cr;
    private float cz;
    private boolean qj;

    public cr(Au au0, int v, boolean z) {
        this.JQp = true;
        this.SM = au0;
        this.DWo = v;
        this.qj = z;
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.PjT = motionEvent0.getX();
                this.Zh = motionEvent0.getY();
                this.cz = motionEvent0.getY();
                this.JQp = true;
                return true;
            }
            case 1: {
                if(!this.Au && !this.JQp) {
                    return false;
                }
                if(!this.qj) {
                    Au au0 = this.SM;
                    if(au0 != null) {
                        au0.PjT();
                        return true;
                    }
                }
                int v = XX.Zh(com.bytedance.sdk.component.adexpress.cr.PjT(), Math.abs(this.XX - this.cz));
                if(this.XX - this.cz < 0.0f && v > this.DWo) {
                    Au au1 = this.SM;
                    if(au1 != null) {
                        au1.PjT();
                        return true;
                    }
                }
                if(this.JQp) {
                    Au au2 = this.SM;
                    if(au2 != null) {
                        au2.PjT();
                        return true;
                    }
                }
                break;
            }
            case 2: {
                float f = motionEvent0.getY();
                this.XX = f;
                if(Math.abs(f - this.cz) > 10.0f) {
                    this.Au = true;
                }
                this.cr = motionEvent0.getX();
                this.ReZ = motionEvent0.getY();
                if(Math.abs(this.cr - this.PjT) > 8.0f || Math.abs(this.ReZ - this.Zh) > 8.0f) {
                    this.JQp = false;
                    return true;
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

