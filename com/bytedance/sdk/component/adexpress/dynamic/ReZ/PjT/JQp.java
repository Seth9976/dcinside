package com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ.Au;

public class JQp implements View.OnTouchListener {
    private int JQp;
    private float PjT;
    private boolean ReZ;
    private float Zh;
    private Au cr;

    public JQp(Au au0, int v) {
        this.cr = au0;
        this.JQp = v;
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        switch(v) {
            case 0: {
                this.PjT = motionEvent0.getY();
                return true;
            label_5:
                if(v == 2) {
                    float f = motionEvent0.getY();
                    this.Zh = f;
                    if(Math.abs(f - this.PjT) > 10.0f) {
                        this.ReZ = true;
                        return true;
                    }
                }
                break;
            }
            case 1: {
                if(!this.ReZ) {
                    return false;
                }
                int v1 = XX.Zh(cr.PjT(), Math.abs(this.Zh - this.PjT));
                if(this.Zh - this.PjT < 0.0f && v1 > this.JQp) {
                    Au au0 = this.cr;
                    if(au0 != null) {
                        au0.PjT();
                        this.PjT = 0.0f;
                        this.Zh = 0.0f;
                        this.ReZ = false;
                        return true;
                    }
                }
                break;
            }
            default: {
                goto label_5;
            }
        }
        return true;
    }
}

