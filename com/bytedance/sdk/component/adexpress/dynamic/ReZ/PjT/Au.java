package com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;

public class Au implements View.OnTouchListener {
    private float JQp;
    private final com.bytedance.sdk.component.adexpress.dynamic.ReZ.Au PjT;
    private final int ReZ;
    private float XX;
    private final boolean Zh;
    private float cr;
    private float cz;

    public Au(com.bytedance.sdk.component.adexpress.dynamic.ReZ.Au au0, boolean z) {
        this.ReZ = 10;
        this.PjT = au0;
        this.Zh = z;
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.cr = motionEvent0.getX();
                this.JQp = motionEvent0.getY();
                new StringBuilder(", mStartY: ").append(this.JQp);
                return true;
            }
            case 1: {
                this.cz = motionEvent0.getX();
                this.XX = motionEvent0.getY();
                new StringBuilder(", mEndY: ").append(this.XX);
                if(!this.Zh) {
                    com.bytedance.sdk.component.adexpress.dynamic.ReZ.Au au0 = this.PjT;
                    if(au0 != null) {
                        au0.PjT();
                        return true;
                    }
                }
                float f = this.cz - this.cr;
                float f1 = this.XX - this.JQp;
                if(((float)XX.Zh(cr.PjT(), Math.abs(((float)Math.sqrt(f * f + f1 * f1))))) > 10.0f) {
                    com.bytedance.sdk.component.adexpress.dynamic.ReZ.Au au1 = this.PjT;
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

