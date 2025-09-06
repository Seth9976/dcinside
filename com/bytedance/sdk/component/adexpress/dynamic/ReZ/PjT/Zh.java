package com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ.Au;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ.SM;

public class Zh implements View.OnTouchListener {
    private SM JQp;
    private float PjT;
    private long ReZ;
    private float Zh;
    private boolean cr;
    private Au cz;

    public Zh(SM sM0, Au au0) {
        this.JQp = sM0;
        this.cz = au0;
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        switch(v) {
            case 0: {
                this.ReZ = System.currentTimeMillis();
                this.PjT = motionEvent0.getX();
                this.Zh = motionEvent0.getY();
                this.JQp.JQp();
                return true;
            label_8:
                if(v != 2) {
                    return true;
                }
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                if(Math.abs(f - this.PjT) < XX.PjT(cr.PjT(), 10.0f) && Math.abs(f1 - this.Zh) < XX.PjT(cr.PjT(), 10.0f)) {
                    return true;
                }
                this.cr = true;
                break;
            }
            case 1: {
                if(this.cr) {
                    return false;
                }
                if(System.currentTimeMillis() - this.ReZ >= 1500L) {
                    Au au0 = this.cz;
                    if(au0 != null) {
                        au0.PjT();
                        return true;
                    }
                    return true;
                }
                break;
            }
            default: {
                goto label_8;
            }
        }
        this.JQp.cz();
        return true;
    }
}

